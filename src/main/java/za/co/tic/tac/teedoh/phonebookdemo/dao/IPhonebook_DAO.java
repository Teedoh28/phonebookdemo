package za.co.tic.tac.teedoh.phonebookdemo.dao;

import za.co.tic.tac.teedoh.phonebookdemo.model.Phonebook;

import java.util.List;

public interface IPhonebook_DAO {
    public boolean savePhonebookEntry(Phonebook phonebook);
    public List<Phonebook> getAllPhonebookEntry();
    public boolean deletePhonebookEntry(Phonebook phonebook);
    public List<Phonebook> getPhonebookEntryByID(Phonebook phonebook);
    public boolean updatePhonebookEntry(Phonebook phonebook);
}
