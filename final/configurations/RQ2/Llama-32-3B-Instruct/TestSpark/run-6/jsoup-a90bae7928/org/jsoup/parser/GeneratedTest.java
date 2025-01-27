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
public class GeneratedTest {

    @Test
    public void initialiseParse_GivenInputAndBaseUri_whenCalled_thenInitialised() {
        // Given
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        treeBuilder.initialiseParse(input, baseUri, mock(Parser.class));

        // Then
        verify(treeBuilder).initialiseParse(input, baseUri, any());
    }

    @Test
    public void parse_GivenInputAndBaseUri_whenCalled_thenDocument() {
        // Given
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        Document document = treeBuilder.parse(input, baseUri);

        // Then
        assertNotNull(document);
    }

    @Test
    public void parse_GivenInputAndBaseUri_whenCalled_withEmptyInput_thenDocument() {
        // Given
        String input = "";
        String baseUri = "http://example.com";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        Document document = treeBuilder.parse(input, baseUri);

        // Then
        assertNotNull(document);
    }

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

    @Test
    public void insertNode_GivenNode_whenCalled_thenInserted() {
        // Given
        Node node = mock(Node.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        treeBuilder.insertNode(node);

        // Then
        verify(treeBuilder).insertNode(node, any());
    }

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

    @Test
    public void insertTokenComment_GivenComment_whenCalled_thenInserted() {
        // Given
        Token.Comment commentToken = mock(Token.Comment.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        treeBuilder.insert(commentToken);

        // Then
        verify(treeBuilder).insertNode(any(), commentToken);
    }

    @Test
    public void insertTokenCharacter_GivenCharacter_whenCalled_thenInserted() {
        // Given
        Token.Character token = mock(Token.Character.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        treeBuilder.insert(token);

        // Then
        verify(treeBuilder).insertNode(any(), token);
    }

    @Test
    public void insertTokenDoctype_GivenDoctype_whenCalled_thenInserted() {
        // Given
        Token.Doctype d = mock(Token.Doctype.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        treeBuilder.insert(d);

        // Then
        verify(treeBuilder).insertNode(any(), d);
    }

    @Test
    public void popStackToClose_GivenEndTag_whenCalled_thenPopped() {
        // Given
        Token.EndTag endTag = mock(Token.EndTag.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        treeBuilder.popStackToClose(endTag);

        // Then
        verify(treeBuilder).insertNode(any(), endTag);
    }

    @Test
    public void parseFragment_GivenInputAndContext_whenCalled_thenParsed() {
        // Given
        String input = "<fragment></fragment>";
        Element context = mock(Element.class);
        Parser parser = mock(Parser.class);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

        // When
        List<Node> parsed = treeBuilder.parseFragment(input, context, "http://example.com", parser);

        // Then
        assertNotNull(parsed);
    }

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