package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedCreateTextNodeTest {

    @Test
    public void createTextNodeTest() {
        String text = "test";
        TextNode node = new TextNode(text);

        assertNotNull(node);
        assertEquals(text, node.text());
    }

}