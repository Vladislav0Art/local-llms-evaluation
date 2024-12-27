package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "inputFragment";
        String baseUri = "baseUri";
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser);
        assertEquals(nodes, xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser));
    }

}