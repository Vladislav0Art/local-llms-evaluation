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

public class GeneratedInsertToken {

    @Test
    public void insertToken() {
        Token token = new Token(Token.Type.COMMENT, "Hello World!", 5);
        Element element = new org.jsoup.nodes.CommentNode();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(element, token);
        assertEquals(1, xmlTreeBuilder.getInsertedTokens().size());
    }

}