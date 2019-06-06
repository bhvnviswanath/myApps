package com.convert.json;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String json = "{\"id\": 1, \"name\": \"The Beatles\"}";
    	
        ObjectMapper mapper = new ObjectMapper();
        try {
            Object artist = mapper.readValue(json, Object.class);
            System.out.println("Artist = " + artist);
            Map<String,Object> map = mapper.readValue(json, Map.class);
            System.out.println(map.values().size());
            
            for (String key : map.keySet()) {
            	System.out.println(key);
    			System.out.println(map.get(key));
    		}
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    	
    }
}
