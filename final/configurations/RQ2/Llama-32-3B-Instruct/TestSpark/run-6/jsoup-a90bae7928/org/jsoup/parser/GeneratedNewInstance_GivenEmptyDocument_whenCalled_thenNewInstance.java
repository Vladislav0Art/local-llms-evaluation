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
public class GeneratedNewInstance_GivenEmptyDocument_whenCalled_thenNewInstance {

    @Test
    public void newInstance_GivenEmptyDocument_whenCalled_thenNewInstance() {
        // Given
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = mock(Document.class);

        // When
        XmlTreeBuilder newInstance = treeBuilder.newInstance();

        // Then
        assertEquals(treeBuilder, newInstance);
    }

}