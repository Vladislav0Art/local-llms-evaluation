package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseFragmentWithElement {

    @Test
    public void testParseFragmentWithElement() {
        Element element = createElement("root", new String[]{"attr1", "attr2"}, null);
        String inputFragment = "<fragment>text</fragment>";
        String baseUri = "http://example.com";
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = new ArrayList<>();
        Mockito.when(parser.parse(inputFragment, baseUri)).thenReturn(nodes);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(new ParseSettings(), element, parser);
        Document document = xmlTreeBuilder.parseFragment(inputFragment, baseUri);
    }

    private Token createElement(String name, String[] attributes, Node parent) {
        return new Token(Token.Type Tag, name, null, null, attributes, null);
    }

    private Token createCommentToken(String comment, String text, Token... children) {
        return new Token(Token.Type Comment, comment, text, null, children, null);
    }

    private Token createDoctypeToken(String doctype, Node parent) {
        return new Token(Token.Type Doctype, doctype, null, null, null, parent);
    }

}