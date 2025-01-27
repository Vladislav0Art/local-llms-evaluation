package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Token;
import org.jsoup.parser.Token.CommentToken;
import org.jsoup.parser.Token.CharacterToken;
import org.jsoup.parser.Token.DoctypeToken;
import org.jsoup.parser.Token.EndTagToken;
import org.jsoup.parser.Token.StartTagToken;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedInsertTokenStartTag_GivenStartTag_whenCalled_thenInserted {

    @Test
    public void insertTokenStartTag_GivenStartTag_whenCalled_thenInserted() {
        // Given
        Token.StartTag startTag = mock(Token.StartTag.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Element element = mock(Element.class);

        // When
        Element inserted = treeBuilder.insert(startTag);

        // Then
        assertNotNull(inserted);
        assertEquals(element, inserted);
    }

}