package za.co.tic.tac.teedoh.phonebookdemo.model;

import javax.persistence.*;

@Entity
public class Phonebook {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int phonebookEntry_id;

    @Column(name="entry_name")
    private String entry_name;

    @Column(name="entry_email")
    private String entry_email;

    @Column(name="entry_address")
    private String entry_address;

    @Column(name="entry_contactNo")
    private String entry_contactNo;

    public int getPhonebookEntry_id() {
        return phonebookEntry_id;
    }

    public void setPhonebookEntry_id(int phonebookEntry_id) {
        this.phonebookEntry_id = phonebookEntry_id;
    }

    public String getEntry_name() {
        return entry_name;
    }

    public void setEntry_name(String entry_name) {
        this.entry_name = entry_name;
    }

    public String getEntry_email() {
        return entry_email;
    }

    public void setEntry_email(String entry_email) {
        this.entry_email = entry_email;
    }

    public String getEntry_address() {
        return entry_address;
    }

    public void setEntry_address(String entry_address) {
        this.entry_address = entry_address;
    }

    public String getEntry_contactNo() {
        return entry_contactNo;
    }

    public void setEntry_contactNo(String entry_contactNo) {
        this.entry_contactNo = entry_contactNo;
    }
}
