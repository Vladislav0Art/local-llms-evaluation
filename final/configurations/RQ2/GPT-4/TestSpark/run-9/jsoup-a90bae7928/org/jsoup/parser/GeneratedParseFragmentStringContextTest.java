package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentStringContextTest {

    @Test
    public void parseFragmentStringContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("body"), "");
        List<Node> fragmentNodeList = xmlTreeBuilder.parseFragment("<frag>testing</frag>", context, "http://www.test.com", new Parser(xmlTreeBuilder));

        // verify fragment parsing in context
        assertEquals("<frag>testing</frag>", fragmentNodeList.get(0).toString());
    }

}