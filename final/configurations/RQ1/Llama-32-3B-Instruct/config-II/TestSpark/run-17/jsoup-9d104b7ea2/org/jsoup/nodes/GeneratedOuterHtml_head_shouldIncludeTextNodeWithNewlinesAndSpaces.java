package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedOuterHtml_head_shouldIncludeTextNodeWithNewlinesAndSpaces {

    public Node createTextNode(String text) {
        Document doc = new Document();
        Element parent = doc.createElement("root");
        doc.appendChild(parent);
        return doc.body().append(text).firstChild();
    }

    @Test
    public void outerHtml_head_shouldIncludeTextNodeWithNewlinesAndSpaces() {
        String text = "   ";
        TextNode node = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document doc = new Document();
        doc.body().append(node).firstChild();
        doc.outerHtmlHead(out, 0, null);
        assertTrue(out.toString().contains("\n"));
    }

}