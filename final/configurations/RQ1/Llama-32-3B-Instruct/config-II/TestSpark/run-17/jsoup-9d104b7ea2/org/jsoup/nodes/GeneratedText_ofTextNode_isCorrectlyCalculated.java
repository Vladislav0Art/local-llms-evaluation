package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedText_ofTextNode_isCorrectlyCalculated {

    public Node createTextNode(String text) {
        Document doc = new Document();
        Element parent = doc.createElement("root");
        doc.appendChild(parent);
        return doc.body().append(text).firstChild();
    }

    @Test
    public void text_ofTextNode_isCorrectlyCalculated() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}