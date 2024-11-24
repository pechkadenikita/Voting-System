package MappingTask;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientVotingCardMapping {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Person.class);
        cfg.addAnnotatedClass(VotingCard.class);
        cfg.addAnnotatedClass(Address.class);

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();

            VotingCard votingCard1 = new VotingCard(66666, "Karanja");
            VotingCard votingCard2 = new VotingCard(11111, "Karanja");
            VotingCard votingCard3 = new VotingCard(44444, "Karanja");

            Address address1 = new Address(123, "Amravati");
            Address address2 = new Address(346, "Nagpur");

          
            Person person1 = new Person(1, "Nikita Pehkade", votingCard1, address1);
            Person person2 = new Person(2, "Shraddha Rathod", votingCard2, address1);
            Person person3 = new Person(3, "Priya Raut", votingCard3, address2);

            
            address1.setPerson(person1);
            address1.setPerson(person2);
            address2.setPerson(person3);

        
            session.save(person1);
            session.save(person2);
            session.save(person3);

          
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
