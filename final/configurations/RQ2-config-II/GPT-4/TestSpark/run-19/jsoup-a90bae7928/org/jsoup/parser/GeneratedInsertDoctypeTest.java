package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        doctype.init("html", "publicId", "systemId", true);
        builder.insert(doctype);
        Node last = builder.stack.last().childNode(0);
        assertTrue(last instanceof DocumentType);
        DocumentType docType = (DocumentType) last;
        assertEquals("html", docType.name());
        assertEquals("publicId", docType.publicId());
        assertEquals("systemId", docType.systemId());
    }

}