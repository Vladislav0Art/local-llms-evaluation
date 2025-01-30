package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertNodeTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void insertNodeTest() {
        Node node = new Element("root");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insertNode(node);
        assertEquals(node, xmlTreeBuilder.currentElement().childNode(0));
    }

}