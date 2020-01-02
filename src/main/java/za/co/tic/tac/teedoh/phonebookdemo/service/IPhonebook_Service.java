package za.co.tic.tac.teedoh.phonebookdemo.service;

import org.springframework.data.repository.CrudRepository;
import za.co.tic.tac.teedoh.phonebookdemo.model.Phonebook;

import java.util.List;

public interface IPhonebook_Service  {

    public boolean savePhonebookEntry(Phonebook phonebook);
    public List<Phonebook> getPhonebookEntry();
    public boolean deletePhonebookEntry(Phonebook phonebook);
    public List<Phonebook> getPhonebookEntryByID(Phonebook phonebook);
    public boolean updatePhonebookEntry(Phonebook phonebook);

}
