package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHead_WorksAsExpectedWhenNoOutputSettingsProvided {

    @Test
    public void outerHtmlHead_WorksAsExpectedWhenNoOutputSettingsProvided() throws IOException {
        TextNode node = new TextNode("text");
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings out = null;
        Document document = Document.createDocument("", "", "");
        Element head = document.createElement("head");
        Document headDocument = Document.createDocument("", head, "");
        Document body = Document.createDocument("", "", headDocument);
        node.outerHtmlHead(accum, depth, out);
        // implement innerHTML logic
    }

}