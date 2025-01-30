package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "&lt;p&gt;Paragraph&lt;/p&gt;";
        TextNode tn = TextNode.createFromEncoded(encodedText);
        assertEquals("<p>Paragraph</p>", tn.getWholeText());
    }

}