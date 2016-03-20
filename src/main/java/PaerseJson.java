import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//json package : com.googlecode.json-simple  add this to your projects's external libraries and you are ready to go

class ParseJson{
	public static void main(String args[]){
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("/home/meharaj/Desktop/styleSuggester/src/main/resources/cloths.json")); // get the file path and past it
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray categories = (JSONArray) jsonObject.keySet();
            Iterator<JSONObject> iterator = categories.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

         //   System.out.println(jsonObject.keySet());
           // System.out.println(jsonObject.values());
            /*Iterator<JSONObject> iterator = jsonObject.values().iterator();
            while (iterator.hasNext()){
                JSONObject jsonchildObject = iterator.next();

            }*/


        }catch (Exception e){
            e.printStackTrace();
        }

		//System.out.println(jsonData);
	}
}

