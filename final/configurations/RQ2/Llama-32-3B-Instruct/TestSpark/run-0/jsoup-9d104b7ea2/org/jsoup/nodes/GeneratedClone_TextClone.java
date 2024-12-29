package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedClone_TextClone {

    @Test
    public void clone_TextClone() {
        TextNode original = new TextNode("Original");
        TextNode cloned = original.clone();

        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

}