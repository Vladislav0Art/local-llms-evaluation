package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode original = new TextNode("Test");

        TextNode cloned = original.clone();

        assertEquals(original.getWholeText(), cloned.getWholeText());
    }

}