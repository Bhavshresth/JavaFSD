package tech.codingclub.Utility;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class TopKeywordAnalyser implements Runnable {
    private final String filePath;

    public TopKeywordAnalyser(String filePath){
        this.filePath=filePath;
}
    public void run(){
        ArrayList<String> data=FileUtility.readFile(filePath);
//      ArrayList is used to extract and read the file with respect to the given file location and store it into the String Datatype ArrayList
        HashMap<String,Integer> keywordCounter=new HashMap<String, Integer>();
/*      HashMap is used to store the info how many words are being repeated
        Read Every Row
        we can have the info/Track that how many number of time the information has occured*/
        for(String row: data){
            String[] keywords=row.split(" ");//"abc def ghi" -> ["abc","def","ghi"]
            //Used to Extract each word wrt to the spaces Given to it and gets stored in the keyword array

//           within each row process each keyword
          for(String keyword : keywords){//
                  String str=keyword.toLowerCase();
                if(! keywordCounter.containsKey(str)){
                    keywordCounter.put(str,1);
                }else {
                    int value = keywordCounter.get((str));
                    keywordCounter.put(str,value+1);
                }
            }
        }

        ArrayList<KeywordCount> keywordCountArrayList=new ArrayList<KeywordCount>();//Pair based array list which is used to take the info from the keyword count constructor
        for(String keyword : keywordCounter.keySet()){
            keywordCountArrayList.add(new KeywordCount(keyword,keywordCounter.get(keyword)));
        }
        Collections.sort(keywordCountArrayList, new Comparator<KeywordCount>() {
            @Override
            public int compare(KeywordCount o1, KeywordCount o2) {
                if(o2.count==o1.count){//count is used in the KeywordCount Class thats why it is used to count the number of keyword
                    return o1.keyword.compareTo(o2.keyword);
                }

                return o2.count- o1.count;
            }
        });
        System.out.println("IN ARRAYLIST FORMAT");
        for( KeywordCount keywordCount: keywordCountArrayList){
     System.out.println(keywordCount.keyword +" : "+keywordCount.count);//used to display the arrayList
        }
        String json=new Gson().toJson(keywordCountArrayList);
        System.out.println("In JSON FORMAT");
        System.out.println(json);//to display the ArrayList in the json format
        String convertJson="{\"keyword\":\"Hello GSON\",\"count\":100}";
        KeywordCount keywordCount=new Gson().fromJson(convertJson,KeywordCount.class);
        System.out.println("Converted to object " +keywordCount.keyword+" : "+keywordCount.count);
    }

    public static void main(String[] args) {

        TaskManager taskManager=new TaskManager(1);
        taskManager.waitTillQueueIsFreeAndAddTask(new TopKeywordAnalyser("C:/Users/patta/IdeaProjects/TechCodingMafia/data/practice/file/IndianNationalAnthem.txt"));


    }

}
