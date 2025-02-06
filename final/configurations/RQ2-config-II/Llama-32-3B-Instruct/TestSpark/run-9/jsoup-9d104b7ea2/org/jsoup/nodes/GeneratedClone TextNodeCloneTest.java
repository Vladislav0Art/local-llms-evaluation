package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedClone TextNodeCloneTest {

    @Test
    public void clone

    TextNodeCloneTest() {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode, clonedTextNode);

        String expectedText = "Hello World";
        assertEquals(expectedText, clonedTextNode.text());
    }

}