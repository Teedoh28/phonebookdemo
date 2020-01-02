package za.co.tic.tac.teedoh.phonebookdemo.dao;

import za.co.tic.tac.teedoh.phonebookdemo.model.Phonebook;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class Phonebook_DAO_Impl implements IPhonebook_DAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean savePhonebookEntry(Phonebook phonebook) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().save(phonebook);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Phonebook> getAllPhonebookEntry() {
        Session currentSession = sessionFactory.getCurrentSession();
        String hql = "SELECT * FROM Phonebook";
        Query query=currentSession.createSQLQuery(hql).addEntity(Phonebook.class);
        //Query query = currentSession.createQuery(hql);
        List<Phonebook> list=(List<Phonebook>)query.getResultList();
        return list;
    }

    @Override
    public boolean deletePhonebookEntry(Phonebook phonebook) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().delete(phonebook);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Phonebook> getPhonebookEntryByID(Phonebook phonebook) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query=currentSession.createSQLQuery("SELECT * from Phonebook where phonebookEntry_id=:phonebookEntry_id").addEntity(Phonebook.class);
        query.setParameter("phonebookEntry_id", phonebook.getPhonebookEntry_id());
       List<Phonebook> list=query.getResultList();

        return list;
    }

    @Override
    public boolean updatePhonebookEntry(Phonebook phonebook) {
        boolean status=false;
        try {
            sessionFactory.getCurrentSession().update(phonebook);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
