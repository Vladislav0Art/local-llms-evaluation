package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<doc/>"), "http://www.test.com");

        // verify document parsing
        assertEquals("<doc />", document.toString());
    }

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<doc/>", "http://www.test.com");

        // verify document parsing
        assertEquals("<doc />", document.toString());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newXmlTreeBuilder = xmlTreeBuilder.newInstance();

        // verify new instance creation
        assertNotSame(xmlTreeBuilder, newXmlTreeBuilder);
    }

    @Test
    public void parseFragmentStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> fragmentNodeList = xmlTreeBuilder.parseFragment("<frag>testing</frag>", "http://www.test.com", new Parser(xmlTreeBuilder));

        // verify fragment parsing
        assertEquals("<frag>testing</frag>", fragmentNodeList.get(0).toString());
    }

    @Test
    public void parseFragmentStringContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("body"), "");
        List<Node> fragmentNodeList = xmlTreeBuilder.parseFragment("<frag>testing</frag>", context, "http://www.test.com", new Parser(xmlTreeBuilder));

        // verify fragment parsing in context
        assertEquals("<frag>testing</frag>", fragmentNodeList.get(0).toString());
    }

}