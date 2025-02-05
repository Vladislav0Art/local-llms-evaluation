package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String someText = "Test";
        TextNode tn = TextNode.createFromEncoded(someText);
        assertEquals(someText, tn.getWholeText());
    }

}