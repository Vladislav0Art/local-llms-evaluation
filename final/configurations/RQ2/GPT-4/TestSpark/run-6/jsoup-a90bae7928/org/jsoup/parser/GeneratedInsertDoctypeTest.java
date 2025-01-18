package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype().name("root").pubSysKey("PUBLIC").systemIdentifier("SystemID");
        xmlTreeBuilder.insert(doctype);
        assertTrue(xmlTreeBuilder.getStack().peekFirst() instanceof DocumentType);
    }

}