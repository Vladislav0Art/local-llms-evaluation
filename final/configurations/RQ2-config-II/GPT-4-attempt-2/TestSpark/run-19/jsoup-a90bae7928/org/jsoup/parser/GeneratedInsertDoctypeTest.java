package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        Token.Doctype d = new Token.Doctype();
        d.appendData("DocType");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(d);
        Assert.assertNotNull(xmlTreeBuilder);
    }

}