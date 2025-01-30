package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        Token.Doctype doctype = new Token.Doctype();
        doctype.nameAttr("test");
        doctype.pubSysKey("pub");
        doctype.publicIdentifier("public");
        doctype.systemIdentifier("system");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.process(doctype);
        assertEquals(1, builder.doc.childNodes().size());
    }

}