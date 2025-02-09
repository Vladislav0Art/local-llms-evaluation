package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

public class GeneratedNewInstanceTest {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    // Test initialiseParse method

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilderNew = xmlTreeBuilder.newInstance();

        Assert.assertNotNull(xmlTreeBuilderNew);
    }

}