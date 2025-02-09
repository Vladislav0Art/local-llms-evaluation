package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        String fragment = "<div><p>Test</p></div>";
        String baseUri = "http://example.com/";
        Parser parser = Parser.xmlParser();

        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment(fragment, baseUri, parser);

        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

}