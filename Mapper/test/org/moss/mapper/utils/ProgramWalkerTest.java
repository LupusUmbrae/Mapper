package org.moss.mapper.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class ProgramWalkerTest {

	@Test
	public void test() throws IOException {
		File src = new File("src");
		ProgramWalker walker = new ProgramWalker();

		List<File> results = walker.findClasses(src);

		for (File entry : results) {
			System.out.println(entry.getName());
		}
	}

}
