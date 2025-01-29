package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        String inputFragment = "input fragment";
        String baseUri = "http://example.com";
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = new ArrayList<>();
        Mockito.when(parser.parse(inputFragment, baseUri)).thenReturn(nodes);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(new ParseSettings(), null, parser);
        Document document = xmlTreeBuilder.parseFragment(inputFragment, baseUri);
    }

}