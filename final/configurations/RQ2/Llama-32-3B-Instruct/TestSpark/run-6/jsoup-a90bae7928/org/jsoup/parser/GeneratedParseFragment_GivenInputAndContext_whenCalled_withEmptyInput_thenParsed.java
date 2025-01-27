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
public class GeneratedParseFragment_GivenInputAndContext_whenCalled_withEmptyInput_thenParsed {

    @Test
    public void parseFragment_GivenInputAndContext_whenCalled_withEmptyInput_thenParsed() {
        // Given
        String input = "";
        Element context = mock(Element.class);
        Parser parser = mock(Parser.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        List<Node> parsed = treeBuilder.parseFragment(input, context, "http://example.com", parser);

        // Then
        assertNotNull(parsed);
    }

}