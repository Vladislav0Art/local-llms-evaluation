package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        Parser parser = new Parser(new XmlTreeBuilder());
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<div>test</div>", "http://example.com/", parser);
        assertEquals(1, nodes.size());
        assertEquals("http://example.com/", nodes.get(0).baseUri());
    }

}