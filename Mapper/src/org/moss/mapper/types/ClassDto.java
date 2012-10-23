package org.moss.mapper.types;

import java.util.Arrays;
import java.util.List;

public class ClassDto
{

    List<String> packageParts;

    AccessorEnum accesor;

    String className;

    public ClassDto(String classString, String packageString)
    {
        packageString = packageString.split(" ")[1];
        packageString = packageString.substring(0, packageString.length() - 1);
        packageParts = Arrays.asList(packageString.split("\\."));

        className = classString;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Package: ");
        for (String part : packageParts)
        {
            builder.append(part);
            builder.append(".");
        }
        builder.append("\n");
        builder.append("Class: ");
        builder.append(className);
        return builder.toString();
    }
}
