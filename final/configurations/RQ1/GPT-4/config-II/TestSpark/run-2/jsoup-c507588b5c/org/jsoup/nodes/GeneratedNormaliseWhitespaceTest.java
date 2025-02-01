package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String value = "    Normalise whitespace    ";
        String normalised = TextNode.normaliseWhitespace(value);

        assertEquals("Normalise whitespace", normalised);
    }

}