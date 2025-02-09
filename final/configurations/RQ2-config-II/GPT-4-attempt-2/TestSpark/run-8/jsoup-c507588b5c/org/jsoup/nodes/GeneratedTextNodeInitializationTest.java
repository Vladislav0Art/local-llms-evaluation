package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeInitializationTest {

    @Test
    public void textNodeInitializationTest() {
        TextNode textNode = new TextNode("test");
        assertNotNull(textNode);
    }

}