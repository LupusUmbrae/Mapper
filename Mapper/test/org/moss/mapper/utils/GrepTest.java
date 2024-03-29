package org.moss.mapper.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

import junit.framework.Assert;

import org.junit.Test;

public class GrepTest {

	@Test
	public void grepString() {
		boolean result = Grep.grepString(".*hello.*", "hello, world");
		Assert.assertTrue(result);
	}
	
	@Test
	public void grepFile() throws IOException{
		File grepTestFile = new File("resources\\greptest.txt");
		List<String> results = Grep.grepFile(".*hello.*", grepTestFile);
		Assert.assertEquals(1, results.size());
	}
	
	@Test
	public void grepMethod() {
	    //\\s[static]?\\s*\\(.*\\)
	    //boolean result = Grep.grepString("[\\s]?(public|private|protected)?\\s[static]?.*\\(.*\\).*", "public static void main(String[] args) throws IOException {");
	    boolean result = Grep.grepString(".*;.*", "a;a");
        Assert.assertTrue(result);
	}

}
