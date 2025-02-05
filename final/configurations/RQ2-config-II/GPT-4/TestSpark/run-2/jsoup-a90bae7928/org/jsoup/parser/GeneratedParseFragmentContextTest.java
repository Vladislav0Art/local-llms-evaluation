package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import org.jsoup.nodes.*;

import static org.junit.Assert.*;

public class GeneratedParseFragmentContextTest {

    @Test
    public void parseFragmentContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<fragment><child></child></fragment>", "https://baseUri.com");
        Element context = document.child(0);
        List<Node> nodes = xmlTreeBuilder.parseFragment("<fragment><child2></child2></fragment>", context, "https://baseUri.com", new Parser(xmlTreeBuilder));
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

}