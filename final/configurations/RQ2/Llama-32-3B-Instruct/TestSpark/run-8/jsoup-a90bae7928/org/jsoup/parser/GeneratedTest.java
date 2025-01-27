package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import javax.annotation.ParametersAreNonnullByDefault;

public class GeneratedTest {

    private XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

    @Test
    public void parseDocumentReaderInputBaseUriTest() throws IOException {
        Reader reader = new StringReader("<root><child/></root>");
        Document document = treeBuilder.parse(reader, "");
        assertNotNull(document);
    }

    @Test
    public void parseDocumentStringInputBaseUriTest() throws IOException {
        String input = "<root><child/></root>";
        Document document = treeBuilder.parse(new StringReader(input), "");
        assertNotNull(document);
    }

    @Test
    public void initialiseParseReaderInputBaseUriParserTest() {
        Reader reader = new StringReader("<root><child/></root>");
        treeBuilder.initialiseParse(reader, "", null);
        assertTrue(treeBuilder.process(new Token(Token.Type.START_TAG, "root")));
    }

    @Test
    public void initialiseParseStringInputBaseUriParserTest() {
        String input = "<root><child/></root>";
        treeBuilder.initialiseParse(new StringReader(input), "", null);
        assertTrue(treeBuilder.process(new Token(Token.Type.START_TAG, "root")));
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder newTreeBuilder = treeBuilder.newInstance();
        assertNotNull(newTreeBuilder);
    }

    @Test
    public void processTokenStartTagTest() {
        Token token = new Token(Token.Type.START_TAG, "tag");
        assertTrue(treeBuilder.process(token));
    }

    @Test
    public void processTokenEndTagTest() {
        Token token = new Token(Token.Type.END_TAG, "tag");
        assertTrue(treeBuilder.process(token));
    }

    @Test
    public void insertNodeTest() {
        Node node = new CDataNode("data");
        treeBuilder.insertNode(node);
        assertNotNull(treeBuilder.getStack());
    }

    @Test
    public void insertNodeTokenStartTagTest() throws IOException {
        Token token = new Token(Token.Type.START_TAG, "tag");
        List<Node> stack = new ArrayList<>();
        treeBuilder.stack = stack;
        treeBuilder.insertNode(token);
        assertEquals(stack.size(), 1);
    }

    @Test
    public void insertCharacterTest() {
        Token characterToken = new Token(Token.Type.CHARACTER, 'c');
        assertTrue(treeBuilder.process(characterToken));
    }

    @Test
    public void insertDoctypeTest() {
        Token doctypeToken = new Token(Token.Type.DOCTYPE, "type");
        assertTrue(treeBuilder.process(doctypeToken));
    }

    @Test
    public void popStackToCloseEndTagTest() throws IOException {
        Token endTagToken = new Token(Token.Type.END_TAG, "tag");
        treeBuilder.stack.push(new Element());
        treeBuilder.popStackToClose(endTagToken);
        assertEquals(0, treeBuilder.stack.size());
    }

    @Test
    public void parseFragmentInputFragmentBaseUriParserTest() throws IOException {
        String inputFragment = "<root><child/></root>";
        List<Node> nodes = treeBuilder.parseFragment(inputFragment, "", null);
        assertNotNull(nodes);
    }

    @Test
    public void parseFragmentInputFragmentElementBaseUriParserTest() throws IOException {
        Element element = new Element();
        List<Node> nodes = treeBuilder.parseFragment("<root><child/></root>", element, "", null);
        assertNotNull(nodes);
    }

}