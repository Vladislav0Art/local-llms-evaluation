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
public class GeneratedProcess_GivenToken_whenCalled_thenProcessed {

    @Test
    public void process_GivenToken_whenCalled_thenProcessed() {
        // Given
        Token token = mock(Token.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> nodes = mock(List.class);

        // When
        boolean processed = treeBuilder.process(token);

        // Then
        assertTrue(processed);
        verify(nodes).add(any());
    }

}