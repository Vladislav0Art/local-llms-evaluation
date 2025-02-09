package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlTail_WorksAsExpectedWhenNoOutputSettingsProvided {

    @Test
    public void outerHtmlTail_WorksAsExpectedWhenNoOutputSettingsProvided() throws IOException {
        TextNode node = new TextNode("text");
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings out = null;
        Document document = Document.createDocument("", "", "");
        Element tail = document.createElement("tail");
        Document tailDocument = Document.createDocument("", tail, "");
        Document body = Document.createDocument("", "", tailDocument);
        node.outerHtmlTail(accum, depth, out);
    }

}