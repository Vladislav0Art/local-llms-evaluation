package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsert_DoctypeToken_ThrowsUnsupportedOperationException {

    @Test
    public void insert_DoctypeToken_ThrowsUnsupportedOperationException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        assertThrows(UnsupportedOperationException, () -> builder.insert(token, Token.Doctype));
    }

}