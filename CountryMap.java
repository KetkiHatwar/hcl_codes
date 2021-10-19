package com.hcl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class CountryMap {
	Map<String,String> info=new HashMap<String,String>();
	public Map <String,String> storeCountryCapital(String CountryName,String capital){
	
	info.put("India", "Delhi");
	info.put("Japan", "Tokyo");
	return info;
	}
	public Map <String,String> retriveCapital(String CountryName){
		Map<String,String> info1=new HashMap<String,String>();
		info1.putAll(info);
	System.out.println(info1.get(CountryName));
		return (info1);
		}
	public Map <String,String> retriveCountryName(String Capital){
		Map<String,String> info2=new HashMap<String,String>();
		info2.putAll(info);
		for (Entry<String, String> entry :info2.entrySet()) {
            if (entry.getValue().equals(Capital)) {
                System.out.println(entry.getKey());
            }
        }
	
		return (info2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryMap obj=new CountryMap();
		Map<String,String> sinfo=obj.storeCountryCapital(null, null);
		System.out.println(sinfo);
		Map<String,String> sinfo1=obj.retriveCapital("Japan");
		Map<String,String> sinfo2=obj.retriveCountryName("Tokyo");
	}

}
