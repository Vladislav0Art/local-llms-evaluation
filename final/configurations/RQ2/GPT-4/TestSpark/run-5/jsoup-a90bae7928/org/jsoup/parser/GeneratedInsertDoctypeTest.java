package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("html");
        builder.insert(doctype);
        List<Node> childNodes = builder.getStack();
        assertEquals(childNodes.get(0).childNode(0).nodeName(), "#doctype");
        assertEquals(((DocumentType) childNodes.get(0).childNode(0)).name(), "html");
    }

}