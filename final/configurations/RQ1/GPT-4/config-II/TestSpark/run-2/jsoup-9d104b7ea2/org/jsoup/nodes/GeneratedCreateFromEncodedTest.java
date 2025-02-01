package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;Hello World&gt;");
        assertEquals("<Hello World>", textNode.getWholeText());
    }

}