package org.moss.mapper.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.DirectoryWalker;
import org.apache.commons.io.FilenameUtils;

public class ProgramWalker extends DirectoryWalker<Object> {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<File> findClasses(File startDirectory) throws IOException {
		List results = new ArrayList();
		walk(startDirectory, results);
		return results;
	}

	protected boolean handleDirectory(File directory, int depth,
			Collection results) {
		return true;
	}

	@SuppressWarnings("unchecked")
	protected void handleFile(File file, int depth, Collection results) {

		String extension = FilenameUtils.getExtension(file.getName());
		if ("java".matches(extension)) {
			results.add(file);
		}

	}
}
