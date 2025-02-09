package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("Hello");
        TextNode clone = tn.clone();
        assertEquals(clone.getWholeText(), tn.getWholeText());
    }

}