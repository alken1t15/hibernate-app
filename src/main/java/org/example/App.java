package org.example;


import org.example.model.*;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session =sessionFactory.openSession();
//        try {
//            session.getTransaction().begin();

//            Person person = session.get(Person.class, 1);
//
//            System.out.println(person.getName());
//            System.out.println(person.getAge());

//            Person person1 = new Person("Test1",30);
//            Person person2 = new Person("Test2",40);
//            Person person3 = new Person("Test3",50);
//
//            session.save(person1);
//            session.save(person2);
//            session.save(person3);

//            Person person = session.get(Person.class,2);
//            person.setName("New name");

//           List<Person> people = session.createQuery("from Person where name like 'T%'").getResultList();
//             session.createQuery("update Person set name = 'Test' where age < 30").executeUpdate();
//           for (Person person : people){
//               System.out.println(person);
//           }
//            session.getTransaction().commit();
//        }finally {
//            sessionFactory.close();
//        }

//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session =sessionFactory.openSession();
//        try {
//            session.getTransaction().begin();

//            Person person = session.get(Person.class,3);
//            System.out.println(person);
//
//            List<Item> items = person.getItems();
//
//            System.out.println(items);

//            Person person = session.get(Person.class,2);
//
//            Item item = new Item("Item from Hibernate",person);
//
//            person.getItems().add(item);
//
//            session.save(item);


//            Person person = new Person("Test cascading",30);
//            person.addItem(new Item("Test cascading item1"));
//            person.addItem( new Item("Test cascading item2"));
//            person.addItem( new Item("Test cascading item3"));
//
//            session.save(person);
//
//            session.getTransaction().commit();
//        }
//        finally {
//            sessionFactory.close();
//        }


//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session =sessionFactory.openSession();
//        try {
//            session.getTransaction().begin();

//            Person person = new Person("Test person", 50);
//
//            Passport passport = new Passport(12345);
//
//            person.setPassport(passport);
//
//            session.save(person);

//            Passport passport = session.get(Passport.class,1);
//
//            System.out.println(passport.getPerson().getName());

//            Person person = session.get(Person.class,1);
//            person.getPassport().setPassportNumber(777777);

//            Person person = session.get(Person.class,1);
//            session.remove(person);
//            session.getTransaction().commit();
//        }
//        finally {
//            sessionFactory.close();
//        }


//        Configuration configuration = new Configuration().addAnnotatedClass(Actor.class).addAnnotatedClass(Movie.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session =sessionFactory.openSession();
//        try(sessionFactory) {
//            session.getTransaction().begin();

//            Movie movie  = new Movie("Pulp fiction",1994);
//            Actor actor1 = new Actor("Harvey Keitel",81);
//            Actor actor2 = new Actor("Samuel L. Jackson",72);
//
//            movie.setActors(new ArrayList<>(List.of(actor1,actor2)));
//
//            actor1.setMovies(new ArrayList<>(Collections.singleton(movie)));
//            actor2.setMovies(new ArrayList<>(Collections.singleton(movie)));
//
//            session.save(movie);
//
//            session.save(actor1);
//
//            session.save(actor2);


//            Movie movie = session.get(Movie.class,1);
//            System.out.println(movie.getActors());

//            Movie movie = new Movie("Reservoir Dogs",1992);
//            Actor actor = session.get(Actor.class,1);
//            movie.setActors(new ArrayList<>(Collections.singleton(actor)));
//            actor.getMovies().add(movie);
//
//            session.save(movie);


//            Actor actor = session.get(Actor.class,2);
//            System.out.println(actor.getMovies());
//
//            Movie movieToRemove = actor.getMovies().get(0);
//            actor.getMovies().remove(0);
//            movieToRemove.getActors().remove(actor);
//
//
//
//
//            session.getTransaction().commit();


//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session =sessionFactory.openSession();
//        try(sessionFactory) {
//            session.getTransaction().begin();

//            Person  person = session.get(Person.class, 1);
//            System.out.println("Получили человека");
//
//            System.out.println(person.getItems());

//            Item item = session.get(Item.class,1);
//            System.out.println("Получили  товар");
//
//            System.out.println(item.getPerson());


//            Person  person = session.get(Person.class, 1);
//            System.out.println("Получили человека из таблицы");
//
//            System.out.println(person.getItems());

//            Person  person = session.get(Person.class, 1);
//            System.out.println("Получили человека из таблицы");
//
//            System.out.println(person);

       //     Hibernate.initialize(person.getItems());

//            session.getTransaction().commit();
//            System.out.println("Вне сессии");
//
//            session = sessionFactory.getCurrentSession();
//
//            session.getTransaction().begin();
//
//            System.out.println("Внутри второй транзакции");
//
//            person = (Person) session.merge(person);

          //  Hibernate.initialize(person.getItems());

//          List<Item> items =  session.createQuery("select  i from  Item  i where i.person.id =:personId", Item.class)
//                            .setParameter("personId", person.getId()).getResultList();
//
//            System.out.println(items);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Вне второй сессии");

//            System.out.println(person.getItems());


        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session =sessionFactory.openSession();
        try(sessionFactory) {
            session.getTransaction().begin();

            // 1 Запрос
        //    List<Person> people = session.createQuery("select  p from Person  p", Person.class).getResultList();

            //N запросов к БД
//            for(Person p : people){
//                System.out.println("Person: " + p.getName() + " has: " + p.getItems());
//            }

            //Solution

//            List<Person> people = session.createQuery("select  p from Person p LEFT join fetch p.items", Person.class).getResultList();

            Set<Person> people = new HashSet<Person>(session.createQuery("select  p from Person p LEFT join fetch p.items", Person.class).getResultList());

                        for(Person p : people){
                System.out.println("Person: " + p.getName() + " has: " + p.getItems());
            }

            session.getTransaction().commit();
        }
    }
}
