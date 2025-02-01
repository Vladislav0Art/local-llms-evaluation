package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String value = "    Strip leading whitespace";
        String stripped = TextNode.stripLeadingWhitespace(value);

        assertEquals("Strip leading whitespace", stripped);
    }

}