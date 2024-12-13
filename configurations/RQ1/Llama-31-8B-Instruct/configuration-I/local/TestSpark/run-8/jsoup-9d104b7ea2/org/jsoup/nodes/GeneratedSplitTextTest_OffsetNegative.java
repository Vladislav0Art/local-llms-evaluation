package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest_OffsetNegative {

    @Test
    public void splitTextTest_OffsetNegative() {
        TextNode textNode = new TextNode("test");
        try {
            textNode.splitText(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

    }