package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTestcreateFromEncoded_unescape {

    @Test
    public void testcreateFromEncoded_unescape() {
        Document document = new Document();
        String encodedText = "&lt;p&gt;This is a sample text.&lt;/p&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<p>This is a sample text.</p>", textNode.text());
    }

}