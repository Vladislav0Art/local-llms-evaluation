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

public class GeneratedInsertEndTag {

    @Test
    public void insertEndTag() {
        Token endTag = new Token(Token.Type DOCTYPE, "<!DOCTYPE html>", 5);
        Element element = new org.jsoup.nodes.DocumentTypeNode();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(element, endTag);
        assertEquals(1, xmlTreeBuilder.getInsertedTokens().size());
    }

}