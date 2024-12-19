package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = new Document();
        Element parent = new Element("parent");
        TextNode textNode = new TextNode("   ");
        textNode.parentNode = parent;
        textNode.coreValue("   ");
        document.append(parent, textNode);
        String result = textNode.toString();
        outContent.reset();
        assertEquals("<p>   </p>", outContent.toString());
    }

}