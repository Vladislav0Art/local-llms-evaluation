package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import org.jsoup.nodes.*;

import static org.junit.Assert.*;

public class GeneratedInsertTokenDoctypeTest {

    @Test
    public void insertTokenDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Doctype("doctype", "", "", true));
        assertNotNull(xmlTreeBuilder.getDocument().childNodes());
    }

}