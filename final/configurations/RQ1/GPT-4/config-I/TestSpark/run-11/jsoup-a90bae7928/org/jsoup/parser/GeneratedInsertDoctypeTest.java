package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader(""), "http://base.uri/", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.runParser();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("doctype");
        xmlTreeBuilder.insert(doctypeToken);
        assertEquals("doctype", xmlTreeBuilder.stack.get(0).childNode(0).nodeName());
    }

}