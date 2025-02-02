package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToString_returnsOuterHtml {

    @Test
    public void toString_returnsOuterHtml() throws IOException {
        Document document = new Document();
        Node parentNode = document.body();
        parentNode.appendChild(new TextNode("Hello, World!"));
        parentNode.appendChild(new TextNode(" "));
        parentNode.appendChild(new TextNode(""));
        parentNode.appendChild(new TextNode("&lt;&gt;"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        parentNode.outerHtmlHead(out, 0, Document.OutputSettings.DEFAULTS);
        assertEquals("<div>Hello, World!</div><br> <span>&lt;</span></div>", out.toString());
    }

}