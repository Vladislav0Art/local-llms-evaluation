package org.jsoup.parser;

import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element el = new Element("root", "http://example.com");
        xmlTreeBuilder.insertNode(el);
        assertEquals(el, xmlTreeBuilder.currentElement().child(0));
    }

}