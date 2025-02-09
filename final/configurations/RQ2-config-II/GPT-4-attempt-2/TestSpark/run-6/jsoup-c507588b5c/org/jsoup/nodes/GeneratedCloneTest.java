package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode clonedNode = textNode.clone();
        assertEquals(textNode.text(), clonedNode.text());
    }

}