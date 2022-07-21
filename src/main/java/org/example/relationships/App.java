package org.example.relationships;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.Properties;

public class App {
    public static void main(String[] args) {

//        Subjectmaterial englishMaterial = new Subjectmaterial();
//        englishMaterial.setId(1);
//        englishMaterial.setUrl("www.someone1.com");
//
//        Subjectmaterial physicsMaterial = new Subjectmaterial();
//        physicsMaterial.setId(2);
//        physicsMaterial.setUrl("www.someone2.com");
//
//        Subjectmaterial bioMaterial = new Subjectmaterial();
//        bioMaterial.setId(3);
//        bioMaterial.setUrl("www.someone3.com");
//
//        Subjectmaterial urduMaterial = new Subjectmaterial();
//        urduMaterial.setId(4);
//        urduMaterial.setUrl("www.someone4.com");
//
//        Subjects english = new Subjects();
//        english.setId(1);
//        english.setName("English");
//
//        Subjects physics = new Subjects();
//        physics.setId(2);
//        physics.setName("Physics");
//
//        Subjects bio = new Subjects();
//        bio.setId(3);
//        bio.setName("Chemistry");
//
//        Subjects urdu = new Subjects();
//        urdu.setId(4);
//        urdu.setName("Urdu");
//
//        bioMaterial.setSubject(bio);
//        physicsMaterial.setSubject(physics);
//        englishMaterial.setSubject(english);
//        urduMaterial.setSubject(urdu);
//
//        Laptops dell = new Laptops();
//        dell.setLid(1);
//        dell.setLname("DELL");
//
//        Laptops hp = new Laptops();
//        hp.setLid(2);
//        hp.setLname("HP");
//
//        Laptops mac = new Laptops();
//        mac.setLid(3);
//        mac.setLname("MAC");
//
//        Laptops lenovo = new Laptops();
//        lenovo.setLid(4);
//        lenovo.setLname("LENOVO");
//
//
//        Students ali = new Students();
//        ali.setName("ALI");
//        ali.setRollno(1);
//        ali.setMarks(22);
//        ali.getLaptops().add(dell);
//        ali.getLaptops().add(mac);
//        dell.setStudent(ali);
//        mac.setStudent(ali);
//
//
//        Students wasi = new Students();
//        wasi.setName("WASI");
//        wasi.setRollno(2);
//        wasi.setMarks(25);
//        wasi.getLaptops().add(hp);
//        hp.setStudent(wasi);
//
//        bio.getStudents().add(ali);
//        physics.getStudents().add(ali);
//        urdu.getStudents().add(wasi);
//        bio.getStudents().add(wasi);

        Laptops netbook = new Laptops();
        netbook.setLid(7);
        netbook.setLname("NETBOOK");

        Laptops ultrabook = new Laptops();
        ultrabook.setLid(8);
        ultrabook.setLname("ULTRABOOK");

        Students hamza = new Students();
        hamza.setName("Hamza");
        hamza.setRollno(4);
        hamza.setMarks(30);
        hamza.getLaptops().add(ultrabook);
        hamza.getLaptops().add(netbook);

        ultrabook.setStudent(hamza);
        netbook.setStudent(hamza);

        Configuration configuration = new Configuration().addAnnotatedClass(Students.class).addAnnotatedClass(Laptops.class).addAnnotatedClass(Subjects.class).addAnnotatedClass(Subjectmaterial.class);
        Properties property = new Properties();

        try  {
            property.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hibernate.properties"));
        }
        catch (Exception e){
            System.out.println("Error is: " + e.getMessage());
        }

        configuration.setProperties(property);
        SessionFactory session_factory = configuration.buildSessionFactory();
        Session session = session_factory.openSession();

        // to do all the changes,
        // we use transaction in
        // order to maintain ACID properties
        Transaction tx = session.beginTransaction();

//        session.save(physics);
//        session.save(english);
//        session.save(urdu);
//        session.save(bio);
//        session.save(bioMaterial);
//        session.save(englishMaterial);
//        session.save(physicsMaterial);
//        session.save(urduMaterial);
//
//        session.save(dell);
//        session.save(hp);
//        session.save(mac);
//        session.save(lenovo);
//
//        session.save(ali);
//        session.save(wasi);

        session.save(hamza);


//        Students output = (Students) session.get(Students.class, 1);
//        System.out.println(output);

//        List<Laptops> laptops = output.getLaptops();
//
//        for(Laptops l: laptops){
//            System.out.println(l);
//        }


        tx.commit();

    }
}