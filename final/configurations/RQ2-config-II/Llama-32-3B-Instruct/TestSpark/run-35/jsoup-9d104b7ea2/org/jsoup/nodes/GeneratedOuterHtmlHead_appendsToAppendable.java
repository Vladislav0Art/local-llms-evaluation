package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_appendsToAppendable {

    @Test
    public void outerHtmlHead_appendsToAppendable() throws IOException, InterruptedException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = out;
        Document.OutputSettings settings = Document.OutputSettings.empty();
        TextNode node = new TextNode("Hello");
        node.outerHtmlHead(accum, 0, settings);
        String html = out.toString();
        assertEquals("<p>Hello</p>", html);
    }

}