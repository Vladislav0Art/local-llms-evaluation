package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import org.jsoup.nodes.*;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<fragment></fragment>", "https://baseUri.com", new Parser(xmlTreeBuilder));
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

}