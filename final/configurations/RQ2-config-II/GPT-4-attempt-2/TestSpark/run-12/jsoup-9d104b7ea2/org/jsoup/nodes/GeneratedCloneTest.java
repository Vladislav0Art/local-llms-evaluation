package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("test text");
        TextNode tnClone = tn.clone();
        assertEquals(tn.text(), tnClone.text());
        assertNotSame(tn, tnClone);
    }

}