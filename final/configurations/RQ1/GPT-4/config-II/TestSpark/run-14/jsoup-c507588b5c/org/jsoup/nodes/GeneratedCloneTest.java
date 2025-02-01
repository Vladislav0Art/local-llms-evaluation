package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("test");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

}