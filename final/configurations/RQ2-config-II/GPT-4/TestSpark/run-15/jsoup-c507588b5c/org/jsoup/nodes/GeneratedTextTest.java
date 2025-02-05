package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String someText = "Test";
        TextNode tn = new TextNode(someText);
        assertEquals(someText, tn.text());
    }

}