package org.moss.mapper.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.internal.matchers.IsCollectionContaining;

public class Grep
{

    public static List<String>
            grepFile(String regex, File file) throws IOException
    {
        ArrayList<String> foundStrings = new ArrayList<String>();
        BufferedReader read = new BufferedReader(new FileReader(file));
        String line;
        while ((line = read.readLine()) != null)
        {
            if (line.matches(regex) && !isComment(line))
            {
                foundStrings.add(line);
            }
        }
        read.close();

        return foundStrings;
    }

    public static boolean grepString(String regex, String string)
    {
        return string.matches(regex);
    }

    private static boolean isComment(String line)
    {
        return line.matches("\\s*[//|\\*].*");
    }
}
