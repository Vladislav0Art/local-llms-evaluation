package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedParseFragmentWithElementTest {

    @Test
    public void parseFragmentWithElementTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "inputFragment";
        Element context = Mockito.mock(Element.class);
        String baseUri = "baseUri";
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, context, baseUri, parser);
        assertEquals(nodes, xmlTreeBuilder.parseFragment(inputFragment, context, baseUri, parser));
    }

}