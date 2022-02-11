package com.company;

class AddressBookApplication {  //AddressBookApplication class
    static AddressBookApplication ab = new AddressBookApplication();   //create class instance of AddressBookApplication
    static Menu myMenu = new Menu(); //create menu instance
    static AddressEntry addressEntry = new AddressEntry(); //create AddressEntry instance
    public static void main(String[] args) {

        myMenu.prompt_FirstName();    //Method call for FirstName
        addressEntry.prompt_FirstName();    //Method call to enter FirstName

        myMenu.prompt_LastName();     //Method call for LastName
        addressEntry.prompt_LastName();     //Method call to enter LastName

        myMenu.prompt_Street();       //Method call for Street
        addressEntry.prompt_Street();       //Method call to enter Street

        myMenu.prompt_City();         //Method call for City
        addressEntry.prompt_City();     //Method call to enter City

        myMenu.prompt_State();        //Method call for State
        addressEntry.prompt_State();        //Method call to enter State

        myMenu.prompt_Zip();          //Method call for Zip
        addressEntry.prompt_Zip();      //Method call to enter Zip

        myMenu.prompt_Telephone();    //Method call for Telephone
        addressEntry.prompt_Telephone();        //Method call to enter Telephone

        myMenu.prompt_Email();        //Method call for Email
        addressEntry.prompt_Email();        //Method call to enter Email
    }
}