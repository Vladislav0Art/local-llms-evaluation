package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        doctype.name("doctype");
        xmlTreeBuilder.insert(doctype);
        Assert.assertTrue(xmlTreeBuilder.stack.getLast() instanceof DocumentType);
    }

}