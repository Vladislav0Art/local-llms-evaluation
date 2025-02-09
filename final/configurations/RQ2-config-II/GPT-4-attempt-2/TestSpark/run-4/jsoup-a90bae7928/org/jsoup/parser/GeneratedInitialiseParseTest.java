package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<test>content</test>");
        xmlTreeBuilder.initialiseParse(input, "http://test.com", Parser.xmlParser());
        Assert.assertNotNull(xmlTreeBuilder);
    }

}