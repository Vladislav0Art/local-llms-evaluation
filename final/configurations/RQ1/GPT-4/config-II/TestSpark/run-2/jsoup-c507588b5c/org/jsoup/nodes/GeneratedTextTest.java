package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String value = "   Test value   ";
        TextNode node = new TextNode(value);

        assertEquals(value.trim(), node.text()); //Asserting with whitespace normalised
    }

}