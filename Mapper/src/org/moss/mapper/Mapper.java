package org.moss.mapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.moss.mapper.utils.FileScrapper;
import org.moss.mapper.utils.ProgramWalker;

//class
/**
 * class class
 * 
 * @author Robin
 * 
 */
public class Mapper
{

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        ProgramWalker walker = new ProgramWalker();
        List<File> classes;
        File programRoot = new File("src"); // TODO: Update this later on

        classes = walker.findClasses(programRoot);

        for (File classFile : classes)
        {
            FileScrapper scrapper = new FileScrapper(classFile);
            scrapper.scrap();
            
        }

    }

}
