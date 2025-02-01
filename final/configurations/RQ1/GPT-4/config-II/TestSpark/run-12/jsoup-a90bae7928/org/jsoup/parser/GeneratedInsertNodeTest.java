package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.StartTag("test"));
        xmlTreeBuilder.insertNode(new TextNode("Test"));
        assertEquals("Test", xmlTreeBuilder.stack.peek().childNode(0).outerHtml());
    }

}