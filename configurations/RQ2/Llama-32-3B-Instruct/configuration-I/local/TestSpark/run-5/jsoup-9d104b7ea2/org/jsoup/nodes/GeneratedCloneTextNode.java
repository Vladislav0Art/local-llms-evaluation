package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedCloneTextNode {

    @Test
    public void cloneTextNode() {
        TextNode original = new TextNode("Hello");
        TextNode clone = original.clone();
        assertNotNull(clone);
        assertEquals(original, clone);
    }

}