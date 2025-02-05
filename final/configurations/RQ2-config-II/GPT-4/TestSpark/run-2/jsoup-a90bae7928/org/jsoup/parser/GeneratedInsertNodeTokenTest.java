package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import org.jsoup.nodes.*;

import static org.junit.Assert.*;

public class GeneratedInsertNodeTokenTest {

    @Test
    public void insertNodeTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        TextNode textNode = new TextNode("sample text");
        Token token = new Token.Character("sample text");
        xmlTreeBuilder.insertNode(textNode, token);
        assertNotNull(xmlTreeBuilder.getDocument().text());
    }

}