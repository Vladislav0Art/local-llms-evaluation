package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentStringTest {

    @Test
    public void parseFragmentStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> fragmentNodeList = xmlTreeBuilder.parseFragment("<frag>testing</frag>", "http://www.test.com", new Parser(xmlTreeBuilder));

        // verify fragment parsing
        assertEquals("<frag>testing</frag>", fragmentNodeList.get(0).toString());
    }

}