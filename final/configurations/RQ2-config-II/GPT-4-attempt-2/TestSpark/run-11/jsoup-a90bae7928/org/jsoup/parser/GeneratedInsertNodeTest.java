package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        TextNode node = new TextNode("test");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insertNode(node);
        assertNotNull(builder);
    }

}