package org.jsoup.parser;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.io.Reader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedTest {

    private static final String XML_INPUT = "<root><person><name>John</name></person></root>";
    private static final String BASE_URI = "http://example.com";

    @BeforeClass
    public static void init() {
        // Initialize the settings and parser for testing purposes.
    }

    @Mock
    protected Parser parser;

    @Test
    public void testDefaultSettings() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseSettings settings = treeBuilder.defaultSettings();

        assertNotNull(settings);
    }

    @Test
    public void testInitialiseParseReaderInputBaseUriParser() throws IOException {
        Reader inputReader = new StringReader(XML_INPUT);
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.initialiseParse(inputReader, BASE_URI, parser);

        assertNotNull(document);
    }

    @Test
    public void testInitialiseParseStringInputBaseUriParser() {
        String inputStr = XML_INPUT;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.initialiseParse(inputStr, BASE_URI, parser);

        assertNotNull(document);
    }

    @Test
    public void testNewInstance() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = treeBuilder.newInstance();

        assertEquals(treeBuilder, newInstance);
    }

    @Test
    public void testProcessTokenStartTag() {
        Token token = Token.StartTag;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        boolean result = treeBuilder.process(token);

        assertTrue(result);
    }

    @Test
    public void testProcessTokenComment() {
        Token token = Token.Comment;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        boolean result = treeBuilder.process(token);

        assertFalse(result);
    }

    @Test
    public void testInsertNode() {
        Node node = new Element("test");
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.insertNode(node);

        assertNotNull(treeBuilder.root());
    }

    @Test
    public void testInsertTokenStartTag() {
        Token token = Token.StartTag;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Element element = treeBuilder.insert(token);

        assertNotNull(element);
        assertEquals(Token.StartTag, token.type());
    }

    @Test
    public void testInsertTokenComment() {
        Token token = Token.Comment;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.insert(token);

        assertNotNull(treeBuilder.root());
        assertTrue(treeBuilder.root().isComment());
    }

    @Test
    public void testInsertTokenCharacter() {
        Token token = Token.Character;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.insert(token);

        assertNotNull(treeBuilder.root());
        assertTrue(treeBuilder.root().isText());
    }

    @Test
    public void testInsertTokenDoctype() {
        Token token = Token.Doctype;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.insert(token);

        assertNotNull(treeBuilder.root());
        assertTrue(treeBuilder.root().isDoctype());
    }

    @Test
    public void testPopStackToCloseTokenEndTag() {
        Token token = Token.EndTag;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.popStackToClose(token);

        assertNotNull(treeBuilder.root());
        assertTrue(treeBuilder.root().isClosed());
    }

    @Test
    public void testParseFragmentInputFragmentBaseUriParser() throws IOException {
        String inputFragment = XML_INPUT;
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> result = treeBuilder.parseFragment(inputFragment, BASE_URI, parser);

        assertNotNull(result);
    }

    @Test
    public void testParseFragmentInputFragmentElementBaseUriParser() throws IOException {
        String inputFragment = XML_INPUT;
        Element context = new Element("context");
        when(parser.getSettings()).thenReturn(new ParseSettings());

        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> result = treeBuilder.parseFragment(inputFragment, context, BASE_URI, parser);

        assertNotNull(result);
    }

}