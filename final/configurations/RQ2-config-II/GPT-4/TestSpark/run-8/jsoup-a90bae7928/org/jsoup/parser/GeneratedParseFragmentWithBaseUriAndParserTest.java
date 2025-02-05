package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFragmentWithBaseUriAndParserTest {

    @Test
    public void parseFragmentWithBaseUriAndParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> fragment = xmlTreeBuilder.parseFragment("<tag></tag>", "www.example.com", new Parser(xmlTreeBuilder));
        assertNotNull(fragment);
        assertFalse(fragment.isEmpty());
    }

}