package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String someText = "Test";
        TextNode tn = new TextNode(someText);
        TextNode splitNode = tn.splitText(2);
        assertEquals("Te", tn.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

}