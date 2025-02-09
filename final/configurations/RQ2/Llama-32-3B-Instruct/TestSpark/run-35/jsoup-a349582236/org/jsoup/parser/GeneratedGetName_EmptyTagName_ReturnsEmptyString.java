package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedGetName_EmptyTagName_ReturnsEmptyString {

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

public class GeneratedTest {

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() throws Exception {
        String tagName = "";
        String expectedName = "";
        Method method = Tag.class.getMethod("getName", String.class);
        assertEquals(expectedName, (String) method.invoke(null, tagName));
    }

}