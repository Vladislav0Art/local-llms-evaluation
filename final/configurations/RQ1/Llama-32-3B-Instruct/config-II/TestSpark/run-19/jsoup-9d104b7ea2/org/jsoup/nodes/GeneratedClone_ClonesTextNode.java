package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedClone_ClonesTextNode {

    @Test
    public void clone_ClonesTextNode() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned.value());
        assertEquals(text, StringUtil.normaliseWhitespace(cloned.text()));
    }

}