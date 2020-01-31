package com.cwctravel.hudson.plugins.extended_choice_parameter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonEditorGson {

	public static String toJson(Object src) {
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		return gson.toJson(src);
	}
}
