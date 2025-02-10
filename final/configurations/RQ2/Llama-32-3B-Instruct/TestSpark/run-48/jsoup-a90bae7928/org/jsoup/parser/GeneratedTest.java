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
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;

public class GeneratedTest {

    private XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

    @Test
    public void parseDocumentFromReader_ReturnsDocument() {
        Reader inputReader = new StringReader("<root><child>text</child></root>");
        Document document = treeBuilder.parse(inputReader, "");
        assertNotNull(document);
    }

    @Test
    public void defaultSettings_ReturnsDefaultSettings() {
        ParseSettings settings = treeBuilder.defaultSettings();
        assertNotNull(settings);
    }

    @Test
    public void initialiseParse_RaisesNullPointerException() {
        Reader inputReader = new StringReader("");
        assertThrows(NullPointerException.class, () -> treeBuilder.initialiseParse(inputReader, "", null));
    }

    @Test
    public void parseDocumentFromString_ReturnsDocument() {
        String inputString = "<root><child>text</child></root>";
        Document document = treeBuilder.parse(new StringReader(inputString), "");
        assertNotNull(document);
    }

    @Test
    public void newInstance_ReturnsNewInstance() {
        XmlTreeBuilder newTreeBuilder = treeBuilder.newInstance();
        assertNotSame(treeBuilder, newTreeBuilder);
    }

    @Test
    public void processToken_ReturnsTrue() {
        Token token = new Token();
        assertTrue(treeBuilder.process(token));
    }

    @Test
    public void insertNode_NodesChildrenAreAddedCorrectly() {
        Node node = new CDataNode("data");
        treeBuilder.insertNode(node);
        assertNotNull(node.children());
    }

    @Test
    public void insertCharacter_insertsTokenAsCharacter() {
        Token token = new Token();
        Character character = new Character('c');
        treeBuilder.insert(token, character);
        assertNotNull(character.value());
    }

    @Test
    public void insertDoctype_insertsDocumentType() {
        Token token = new Token();
        DocumentType documentType = new DocumentType("test");
        treeBuilder.insert(token, documentType);
        assertNotNull(documentType.name());
    }

    @Test
    public void popStackToClose_EndTagIsRemovedCorrectly() {
        Token endTag = new Token();
        treeBuilder.popStackToClose(endTag);
        assertNull(treeBuilder.stack().isEmpty());
    }
}

public class Token {
    private String type;
    private Character value;

    public Token() {
    }

    public Token(String type) {
        this.type = type;
    }

    public Token(String type, Character value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }
}

public class DocumentType {
    private String name;

    public DocumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}