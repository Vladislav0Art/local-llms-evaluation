package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String testString = "Test String";
        TextNode textNode = new TextNode(testString);
        TextNode cloneTextNode = textNode.clone();
        assertEquals(cloneTextNode.getWholeText(), textNode.getWholeText());
    }

}