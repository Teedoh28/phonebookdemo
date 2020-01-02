package za.co.tic.tac.teedoh.phonebookdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.tic.tac.teedoh.phonebookdemo.model.Phonebook;
import za.co.tic.tac.teedoh.phonebookdemo.service.IPhonebook_Service;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class Controller {

    @Autowired
    private IPhonebook_Service iPhonebook_service;



    @PostMapping("/save-entry")
    public boolean saveStudent(@RequestBody Phonebook phonebook) {
        return iPhonebook_service.savePhonebookEntry(phonebook);

    }

    @GetMapping("/retrieve-list")
    public List<Phonebook> allPhonebookEntries() {
        return iPhonebook_service.getPhonebookEntry();

    }

    @DeleteMapping("/delete-entry/{entry_id}")
    public boolean deletePhonebookEntry(@PathVariable("entry_id") int entry_id,Phonebook phonebook) {
        phonebook.setPhonebookEntry_id(entry_id);
        return iPhonebook_service.deletePhonebookEntry(phonebook);
    }

    @GetMapping("/phonebook/{entry_id}")
    public List<Phonebook> retrievePhonebookEntryByID(@PathVariable("entry_id") int entry_id, Phonebook phonebook) {
        phonebook.setPhonebookEntry_id(entry_id);
        return iPhonebook_service.getPhonebookEntryByID(phonebook);

    }

    @PostMapping("update-entry/{entry_id}")
    public boolean updateStudent(@RequestBody Phonebook phonebook,@PathVariable("entry_id") int entry_id) {
        phonebook.setPhonebookEntry_id(entry_id);
        return iPhonebook_service.updatePhonebookEntry(phonebook);
    }
}
