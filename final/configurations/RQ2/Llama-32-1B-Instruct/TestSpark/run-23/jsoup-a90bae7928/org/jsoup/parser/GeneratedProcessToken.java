package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.CommentNode;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.DocumentTypeNode;
import org.jsoup.nodes.EntityBuilder;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlDeclarationParser;
import org.jsoup.parser.XmlParser;
import org.jsoup.parser.XmlTreeBuilderTest;
import org.mockito.Mockito;

public class GeneratedProcessToken {

    @Test
    public void processToken() {
        Token token = new Token(Token.Type.Character, "a", 1);
        Element element = new org.jsoup.nodes.CommentNode();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(token, element);
        assertEquals(2, xmlTreeBuilder.getInsertedTokens().size());
    }

}