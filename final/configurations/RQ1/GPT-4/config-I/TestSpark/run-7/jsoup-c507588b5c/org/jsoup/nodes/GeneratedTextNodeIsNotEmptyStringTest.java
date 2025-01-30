package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeIsNotEmptyStringTest {

    @Test
    public void textNodeIsNotEmptyStringTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        assertNotNull(tn);
        assertFalse(tn.isBlank());
        assertEquals(text, tn.getWholeText());
    }

}