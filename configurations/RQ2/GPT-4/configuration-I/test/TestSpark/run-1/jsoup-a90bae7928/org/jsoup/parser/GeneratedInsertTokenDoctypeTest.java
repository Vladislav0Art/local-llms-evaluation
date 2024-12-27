package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertTokenDoctypeTest {

    @Test
    public void insertTokenDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.setPubSysKey("SYSTEM");
        xmlTreeBuilder.insert(doctypeToken);
        assertTrue(xmlTreeBuilder.stack.getFirst() instanceof DocumentType);
    }

}