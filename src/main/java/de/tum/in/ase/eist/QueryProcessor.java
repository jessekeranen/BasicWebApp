package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

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
        } else if (query.contains("plus")){ // TODO extend the programm here
            String[] array = query.split(" ");
            int sum =  Integer.valueOf(array[3]) + Integer.valueOf(array[5]);
            return String.valueOf(sum);
        }
        else return "";
    }
}
