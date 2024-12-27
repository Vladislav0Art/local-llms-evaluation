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
public class GeneratedSplitTextTest_OffsetGreaterThanTextLength {

    @Test
    public void splitTextTest_OffsetGreaterThanTextLength() {
        TextNode textNode = new TextNode("Hello");
        TextNode result = textNode.splitText(10);
        assertEquals("Hello", result.text());
    }

}