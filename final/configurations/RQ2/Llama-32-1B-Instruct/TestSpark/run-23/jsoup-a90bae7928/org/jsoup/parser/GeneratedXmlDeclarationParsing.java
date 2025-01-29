package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.CommentNode;
import org.jsoup.parser.XmlDeclarationParser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

public class GeneratedXmlDeclarationParsing {

    public Token parseToken(Token token) {
        return new Token(token);
    }

    @Test
    public void xmlDeclarationParsing() {
        String input = "<!DOCTYPE html><html><head></head><body></body></html>";
        Document document = new XmlTreeBuilder().parse(new StringReader(input));
        assertEquals("<!DOCTYPE html", document.getDocumentType());
    }

}