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

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "test";
        TextNode node = new TextNode(text);

        assertEquals(text, node.text());
        assertEquals("test", node.text("new text").text());
    }

}