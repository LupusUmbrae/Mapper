package org.moss.mapper.types;

public enum AccessorEnum
{
    PUBLIC, PRIVATE, DEFAULT, PROTECTED;

    public static AccessorEnum lookup(String accessor)
    {
        for (AccessorEnum curEnum : AccessorEnum.values())
        {
            if (curEnum.name().matches(accessor.toUpperCase()))
            {
                return curEnum;
            }
        }
        return DEFAULT;
    }
}
