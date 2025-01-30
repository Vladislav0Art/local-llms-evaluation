package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        String testString = "test";
        TextNode textNode = new TextNode(testString);
        assertEquals(testString, textNode.getWholeText());
    }

}