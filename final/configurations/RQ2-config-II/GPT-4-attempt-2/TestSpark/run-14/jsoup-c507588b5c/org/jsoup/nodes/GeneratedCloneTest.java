package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode original = new TextNode("hello");
        TextNode cloned = original.clone();
        assertNotSame(original, cloned);
    }

}