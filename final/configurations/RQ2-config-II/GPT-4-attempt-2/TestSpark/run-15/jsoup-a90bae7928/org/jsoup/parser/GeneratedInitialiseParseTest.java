package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParseTest {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    // Test initialiseParse method

    @Test
    public void initialiseParseTest() {
        StringReader stringReader = new StringReader("<root></root>");
        String baseUri = "http://base.uri";
        Parser parser = new Parser(xmlTreeBuilder);

        xmlTreeBuilder.initialiseParse(stringReader, baseUri, parser);
    }

}