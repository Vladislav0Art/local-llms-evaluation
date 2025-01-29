package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertFragment {

    @Test
    public void testInsertFragment() {
        String inputFragment = "<fragment>text</fragment>";
        String baseUri = "http://example.com";
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = new ArrayList<>();
        Mockito.when(parser.parse(inputFragment, baseUri)).thenReturn(nodes);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(new ParseSettings(), null, parser);
        Document document = xmlTreeBuilder.parseFragment(inputFragment, baseUri);
    }

    private Node createNode(String name, String[] attributes) {
        return new Node(name, attributes, null);
    }

}