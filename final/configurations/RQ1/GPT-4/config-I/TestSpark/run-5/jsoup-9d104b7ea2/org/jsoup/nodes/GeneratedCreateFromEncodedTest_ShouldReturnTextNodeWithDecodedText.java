package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCreateFromEncodedTest_ShouldReturnTextNodeWithDecodedText {

    @Test
    public void createFromEncodedTest_ShouldReturnTextNodeWithDecodedText() {
        TextNode textNode = TextNode.createFromEncoded("&lt;p&gt;Hello, world!&lt;/p&gt;");
        assertEquals("<p>Hello, world!</p>", textNode.getWholeText());
    }

}