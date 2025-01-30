package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeIsEmptyStringTest {

    @Test
    public void textNodeIsEmptyStringTest() {
        String text = "";
        TextNode tn = new TextNode(text);
        assertNotNull(tn);
        assertTrue(tn.isBlank());
        assertEquals(text, tn.getWholeText());
    }

}