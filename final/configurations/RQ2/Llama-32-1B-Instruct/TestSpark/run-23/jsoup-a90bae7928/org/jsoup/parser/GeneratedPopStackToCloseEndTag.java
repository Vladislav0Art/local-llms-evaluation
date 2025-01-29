package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.CommentNode;
import org.jsoup.parser.XmlDeclarationParser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

public class GeneratedPopStackToCloseEndTag {

    public Token parseToken(Token token) {
        return new Token(token);
    }

    @Test
    public void popStackToCloseEndTag() {
        Token endTag = parseToken(new Token(Token.Type.DOCTYPE, "<!DOCTYPE html>", 5));
        Element element = new org.jsoup.nodes.DocumentTypeNode();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.popStackToClose(endTag);
        assertEquals(0, xmlTreeBuilder.getInsertedTokens().size());
    }

}