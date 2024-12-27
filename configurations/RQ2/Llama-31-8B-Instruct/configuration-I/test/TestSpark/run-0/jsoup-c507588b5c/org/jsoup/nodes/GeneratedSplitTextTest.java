package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;
import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(5);
        assertEquals("Hello", result.text());
    }

}