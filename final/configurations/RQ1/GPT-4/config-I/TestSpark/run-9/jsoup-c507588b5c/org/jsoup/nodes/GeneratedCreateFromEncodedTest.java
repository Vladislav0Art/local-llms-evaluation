package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encoded = "&lt;Test&gt;";

        TextNode node = TextNode.createFromEncoded(encoded);

        assertEquals("<Test>", node.getWholeText());
    }

}