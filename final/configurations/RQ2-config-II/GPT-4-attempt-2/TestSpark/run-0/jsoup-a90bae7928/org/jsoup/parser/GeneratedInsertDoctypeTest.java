package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype d = new Token.Doctype();
        d.init("html", "", "", false);
        xmlTreeBuilder.insert(d);
        assertEquals("html", ((DocumentType) xmlTreeBuilder.doc.childNode(0)).attr("name"));
    }

}