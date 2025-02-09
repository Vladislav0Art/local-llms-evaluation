package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("div"), "http://test.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test></test>", context, "http://test.com", Parser.xmlParser());
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
        assertEquals("<test></test>", nodes.get(0).toString());
    }

}