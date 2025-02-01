package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String testString = " Test String ";
        TextNode textNode = new TextNode(testString);
        assertEquals(testString, textNode.getWholeText());
    }

}