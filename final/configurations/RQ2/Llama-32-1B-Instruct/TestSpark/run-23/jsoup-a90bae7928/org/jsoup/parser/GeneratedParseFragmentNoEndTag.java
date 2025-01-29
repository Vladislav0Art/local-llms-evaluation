package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.CommentNode;
import org.jsoup.parser.XmlDeclarationParser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

public class GeneratedParseFragmentNoEndTag {

    public Token parseToken(Token token) {
        return new Token(token);
    }

    @Test
    public void parseFragmentNoEndTag() {
        String inputFragment = "<p>This is a paragraph.";
        Element context = new org.jsoup.nodes.DocumentTypeNode();
        XmlParser parser = Mockito.mock(XmlParser.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.parse(context, "", parser);
        assertEquals(1, xmlTreeBuilder.getInsertedTokens().size());
    }

}