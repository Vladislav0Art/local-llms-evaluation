package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedInsertDoctypeTokenTest {

    @Test
    public void insertDoctypeTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        builder.insert(doctypeToken);
        Node node = builder.getStack().get(0);
        assertTrue(node instanceof DocumentType);
        assertEquals("html", ((DocumentType) node).name());
    }

}