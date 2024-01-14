package tech.codingclub.database;

import tech.codingclub.entity.Coders;

import java.util.Date;
import java.util.List;

public class CRUDExample {
    public static void main(String[] args) {
        System.out.println("This is Bhavshresth Pattanayak");
        System.out.println("Reading rows at "+new Date().toString());

        readTableCoders();
//        Update Operation
        new GenericDB<String >().updateColumn(tech.codingclub.tables.Coders.CODERS.NAME,"Coding Mafia",tech.codingclub.tables.Coders.CODERS,tech.codingclub.tables.Coders.CODERS.NAME.eq("Bhavshresth"));
        readTableCoders();

//      Deletion Operation to be done
    }

    private static void readTableCoders() {
        //      To display one Row
        Coders coder=new GenericDB<Coders>().getRow(tech.codingclub.tables.Coders.CODERS,Coders.class,null);
        List<Coders> x= (List<Coders>) GenericDB.getRows(tech.codingclub.tables.Coders.CODERS,Coders.class,null,null);
//      Read Operation
        for(Coders row: x){
            System.out.println("Row :"+ row.getName()+" : "+ row.getAge());
        }
    }
}
