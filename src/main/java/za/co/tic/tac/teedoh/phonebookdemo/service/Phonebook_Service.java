package za.co.tic.tac.teedoh.phonebookdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.tic.tac.teedoh.phonebookdemo.dao.IPhonebook_DAO;
import za.co.tic.tac.teedoh.phonebookdemo.model.Phonebook;


@Service
@Transactional
public class Phonebook_Service implements IPhonebook_Service  {


    @Autowired
    private IPhonebook_DAO iPhonebook_dao;

    @Override
    public boolean savePhonebookEntry(Phonebook phonebook) {
        return iPhonebook_dao.savePhonebookEntry(phonebook);
    }

    @Override
    public List<Phonebook> getPhonebookEntry() {
        return iPhonebook_dao.getAllPhonebookEntry();
    }

    @Override
    public boolean deletePhonebookEntry(Phonebook phonebook) {
        return iPhonebook_dao.deletePhonebookEntry(phonebook);
    }

    @Override
    public List<Phonebook> getPhonebookEntryByID(Phonebook phonebook) {
        return iPhonebook_dao.getPhonebookEntryByID(phonebook);
    }

    @Override
    public boolean updatePhonebookEntry(Phonebook phonebook) {
        return iPhonebook_dao.updatePhonebookEntry(phonebook);
    }


}
