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

public class GeneratedTextTest_Chaining {

    @Test
    public void textTest_Chaining() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}