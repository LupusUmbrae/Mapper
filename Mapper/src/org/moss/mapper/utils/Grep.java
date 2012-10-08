package org.moss.mapper.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Grep {

	public static List<String> grepFile(String regex, File file)
			throws IOException {
		ArrayList<String> foundStrings = new ArrayList<String>();
		FileReader in = new FileReader(file);
		BufferedReader read = new BufferedReader(in);
		String line;
		while ((line = read.readLine()) != null) {
			if (line.matches(regex)) {
				foundStrings.add(line);
			}
		}

		return foundStrings;
	}
	
	public static boolean grepString(String regex, String string){
		return string.matches(regex);
	}
}
