package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedSetSelfClosing_ValidTags_SetSelfClosingStatus {

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
    public void setSelfClosing_ValidTags_SetSelfClosingStatus() throws Exception {
        String tagName = "img";
        boolean expectedSelfClosing = true;
        Method method = Tag.class.getMethod("setSelfClosing", boolean.class);
        assertTrue((boolean) method.invoke(null, expectedSelfClosing));
    }

}