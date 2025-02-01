package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode clonedNode = node.clone();
        assertEquals(node.getWholeText(), clonedNode.getWholeText());
    }

}