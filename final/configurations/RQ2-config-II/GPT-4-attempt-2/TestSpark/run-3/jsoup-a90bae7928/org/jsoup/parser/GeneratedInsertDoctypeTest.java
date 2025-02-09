package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Doctype("html"));
        Assert.assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

}