package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_appendsToAppendable {

    @Test
    public void outerHtmlTail_appendsToAppendable() throws IOException, InterruptedException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = out;
        Document.OutputSettings settings = Document.OutputSettings.empty();
        TextNode node = new TextNode("Hello");
        node.outerHtmlTail(accum, 0, settings);
        String html = out.toString();
        assertEquals("<p></p>", html);
    }

}