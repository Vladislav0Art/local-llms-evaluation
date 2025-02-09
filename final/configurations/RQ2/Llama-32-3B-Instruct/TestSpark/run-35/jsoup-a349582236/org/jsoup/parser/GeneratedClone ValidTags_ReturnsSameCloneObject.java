package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedClone ValidTags_ReturnsSameCloneObject {

    @Test
    public void clone

    ValidTags_ReturnsSameCloneObject() throws Exception {
        String tagName1 = "div";
        String tagName2 = "div";
        Tag expectedTag = new Tag(tagName1);
        assertSame(expectedTag, (Tag) Tag.class.getMethod("clone", String.class).invoke(null, tagName2));
    }
}

public class Tag {
    private String name;
    private boolean selfClosing;

    public Tag(String name) {
        this.name = name;
    }

    public static Tag clone(String tagName) {
        return new Tag(tagName);
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    public String getName() {
        return name;
    }

}