package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Clone");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.getWholeText(), clonedNode.getWholeText());
    }

}