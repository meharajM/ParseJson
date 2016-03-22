import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


class ParseJson{
	public static void main(String args[]){
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("/home/meharaj/Desktop/styleSuggester/src/main/resources/cloths.json"));
            JSONObject jsonObject = (JSONObject) obj;

            System.out.println(jsonObject.keySet());
            System.out.println(jsonObject.values());
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

