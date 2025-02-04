package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

import static org.mockito.Mockito.when;

public class GeneratedToString_test {

    @Test
    public void toString_test() throws IOException {
        Document document = new Document();
        Element parent = new Element("div");
        parent.appendChild(document);

        when(parentNode).thenReturn(parent);
        when(parentTag()).thenReturn(new Element("div"));

        TextNode textNode = new TextNode("Hello World");
        assertEquals("<div>Hello World</div>", textNode.toString());
    }

}