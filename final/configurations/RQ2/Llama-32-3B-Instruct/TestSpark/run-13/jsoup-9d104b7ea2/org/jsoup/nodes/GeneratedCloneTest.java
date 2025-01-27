package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }

    public static boolean isNotEmpty(String str) {
        return str != null && !str.isEmpty();
    }

}