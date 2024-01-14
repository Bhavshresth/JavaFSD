package tech.codingclub.database;

import tech.codingclub.entity.Coders;

public class TestCodersTable {

    public static void main(String[] args) {

        Coders coder = new Coders("Bhavshresth Pattanayak", 22L );

//        Insert this!
//        Friend
//       Create Operation
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS,coder);


//        Spammer
        Coders coderSpammer = new Coders("Spammer", 22L );

        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS,coder);

//        CRUD Operations
//        Create Read Update Delete

    }
}
