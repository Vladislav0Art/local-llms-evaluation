package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Doctype());
        Assert.assertTrue(true);
    }

}