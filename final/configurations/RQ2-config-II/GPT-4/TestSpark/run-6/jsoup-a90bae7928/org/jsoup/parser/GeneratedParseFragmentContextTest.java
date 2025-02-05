package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Token;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseFragmentContextTest {

    @Test
    public void parseFragmentContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<div>Hello, world!</div>";
        Element context = new Element();
        String baseUri = "http://example.com";
        Parser parser = Parser.htmlParser();

        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, context, baseUri, parser);

        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

}