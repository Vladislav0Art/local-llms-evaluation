package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String value = "Test value";
        TextNode node = new TextNode(value);

        TextNode cloneNode = node.clone();

        assertEquals(cloneNode.getWholeText(), node.getWholeText());
    }

}