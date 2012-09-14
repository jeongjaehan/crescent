package com.tistory.devyongsik.util.update;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class SampleDataMaker {
	public static void main(String[] args) {
		
		List<Map<String, String>> sampleList = new ArrayList<Map<String, String>>();
		String field_name_1 = "board_id";
		String field_name_2 = "title";
		String field_name_3 = "dscr";
		String field_name_4 = "creuser";
		//String field_name_5 = "we_ins_user";
		//String field_name_6 = "we_ins_date";
		
		for(int i = 0; i < 500; i++) {
			Map<String, String> doc = new HashMap<String, String>();
			doc.put(field_name_1, String.valueOf(i));
			doc.put(field_name_4, "creuser"+i);
			doc.put(field_name_3, "텍스트 입니다"+i);
			doc.put(field_name_2, "제목 입니다"+i);
			//doc.put(field_name_5, "need4spd");
			//doc.put(field_name_6, "20120819");
			
			sampleList.add(doc);
		}
		
		Gson gson = new Gson();
		String sampleData = gson.toJson(sampleList);
		
		System.out.println(sampleData);
	}
}
