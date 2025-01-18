package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentStringElementTest {

    @Test
    public void parseFragmentStringElementTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("body"), "http://www.test.com");
        List<Node> fragmentNodeList = xmlTreeBuilder.parseFragment("<frag>testing</frag>", context, "http://www.test.com", new Parser(xmlTreeBuilder));

        // verify fragment parsing
        assertEquals("<frag>testing</frag>", fragmentNodeList.get(0).toString());
    }

}