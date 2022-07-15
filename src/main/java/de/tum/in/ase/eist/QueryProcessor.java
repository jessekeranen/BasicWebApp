package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Jesse";
        } else if (query.contains("plus")){
            String[] array = query.split(" ");
            int sum =  Integer.valueOf(array[3]) + Integer.valueOf(array[5]);
            return String.valueOf(sum);
        }
        else if(query.contains("largest")) {
            String[] array = query.split(" ");
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 9; i < array.length; i++){
                list.add(Integer.valueOf(array[i]));
            }

            int biggest = list.get(9);

            for (int i = 9; i < array.length-1; i++){
                if (list.get(i) < list.get(i+1)) {
                    biggest = list.get(i+1);
                }
            }

            return String.valueOf(biggest);
        }
        else return "";
    }
}
