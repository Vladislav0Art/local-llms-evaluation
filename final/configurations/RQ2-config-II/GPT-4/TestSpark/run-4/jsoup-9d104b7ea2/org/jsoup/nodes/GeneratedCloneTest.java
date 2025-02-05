package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("testing");
        TextNode clone = tn.clone();
        assertNotSame(tn, clone);
        assertEquals(tn.text(), clone.text());
    }

}