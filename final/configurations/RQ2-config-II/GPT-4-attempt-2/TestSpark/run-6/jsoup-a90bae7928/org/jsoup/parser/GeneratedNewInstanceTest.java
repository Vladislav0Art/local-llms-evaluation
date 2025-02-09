package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        Assert.assertTrue(xmlTreeBuilder.newInstance() instanceof XmlTreeBuilder);
    }

}