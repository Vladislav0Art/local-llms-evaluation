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
public class GeneratedParseFragmentWithContextBaseUriAndParserTest {

    @Test
    public void parseFragmentWithContextBaseUriAndParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element("context");
        List<Node> fragment = xmlTreeBuilder.parseFragment("<tag></tag>", context, "www.example.com", new Parser(xmlTreeBuilder));
        assertNotNull(fragment);
        assertFalse(fragment.isEmpty());
    }

}