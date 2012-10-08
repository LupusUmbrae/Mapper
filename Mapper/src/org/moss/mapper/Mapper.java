package org.moss.mapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.moss.mapper.utils.Grep;
import org.moss.mapper.utils.ProgramWalker;

public class Mapper {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ProgramWalker walker = new ProgramWalker();
		List<File> classes;
		File programRoot = new File("src"); // TODO: Update this later on

		classes = walker.findClasses(programRoot);

		for (File classFile : classes) {
			List<String> packageString = Grep
					.grepFile(".*package.*", classFile);

			List<String> classString = Grep.grepFile(".*class.*", classFile);
			
			System.out.println("hello");
		}

	}

}
