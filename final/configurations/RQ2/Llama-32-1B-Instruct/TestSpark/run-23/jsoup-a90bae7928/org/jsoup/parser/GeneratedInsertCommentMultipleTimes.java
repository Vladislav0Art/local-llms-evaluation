package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.CommentNode;
import org.jsoup.parser.XmlDeclarationParser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

public class GeneratedInsertCommentMultipleTimes {

    public Token parseToken(Token token) {
        return new Token(token);
    }

    @Test
    public void insertCommentMultipleTimes() {
        Token commentToken = parseToken(new Token(Token.Type.COMMENT, "This is a comment.", 10));
        Element element = new org.jsoup.nodes.CommentNode();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(element, commentToken);
        assertEquals(1, xmlTreeBuilder.getInsertedTokens().size());
    }

}