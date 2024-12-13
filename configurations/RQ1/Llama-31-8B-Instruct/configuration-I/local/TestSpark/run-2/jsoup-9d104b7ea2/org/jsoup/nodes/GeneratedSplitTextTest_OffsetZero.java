package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitTextTest_OffsetZero {

    @Test
    public void splitTextTest_OffsetZero() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(0);
        assertEquals("", textNode.text());
        assertEquals("test", result.text());
    }

}