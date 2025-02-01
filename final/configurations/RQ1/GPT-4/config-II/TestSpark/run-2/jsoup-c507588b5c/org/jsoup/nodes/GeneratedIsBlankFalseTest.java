package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedIsBlankFalseTest {

    @Test
    public void isBlankFalseTest() {
        TextNode node = new TextNode("Test value");

        assertFalse(node.isBlank());
    }

}