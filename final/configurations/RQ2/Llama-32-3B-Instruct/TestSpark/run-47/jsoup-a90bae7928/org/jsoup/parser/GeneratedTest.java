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
import java.util.List;

public class GeneratedTest {

    @Test
    public void InitialiseParse_InputIsNull_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new XmlTreeBuilder().initialiseParse(null, null, null));
    }

    @Test
    public void InitialiseParse_InputIsEmpty_ThrowsIOException() {
        String input = "";
        Reader reader = new StringReader(input);
        assertThrows(IOException.class, () -> new XmlTreeBuilder().initialiseParse(reader, null, null));
    }

    @Test
    public void Parse_InputIsString_ReturnsDocument() {
        String input = "<html><body>Hello World!</body></html>";
        Document document = new XmlTreeBuilder().parse(new StringReader(input), null);
        assertNotNull(document);
    }

    @Test
    public void Parse_InputIsNull_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new XmlTreeBuilder().parse(null, null));
    }

    @Test
    public void NewInstance_ReturnsNewInstance() {
        XmlTreeBuilder instance1 = new XmlTreeBuilder();
        XmlTreeBuilder instance2 = instance1.newInstance();
        assertNotNull(instance2);
    }

    @Test
    public void Process_StartTag_ReturnsTrue() {
        Token token = new Token.TokenStartTag("tag");
        assertTrue(new XmlTreeBuilder().process(token));
    }

    @Test
    public void Process_EndTag_ReturnsFalse() {
        Token token = new Token.TokenEndTag("tag");
        assertFalse(new XmlTreeBuilder().process(token));
    }

    @Test
    public void InsertNode_NodeIsNotNull_ThrowsNullPointerException() {
        Node node = null;
        assertThrows(NullPointerException.class, () -> new XmlTreeBuilder().insertNode(node));
    }

    @Test
    public void InsertNode_NodeIsNotNull_InsertsNode() {
        Node node = new Element("node");
        new XmlTreeBuilder().insertNode(node);
        assertNotNull(new XmlTreeBuilder().getNode());
    }

    @Test
    public void InsertCharacter_CharacterIsNotNull_ThrowsNullPointerException() {
        Character character = null;
        assertThrows(NullPointerException.class, () -> new XmlTreeBuilder().insertCharacter(character));
    }

    @Test
    public void InsertCharacter_CharacterIsNotNull_InsertsCharacter() {
        Character character = 'c';
        new XmlTreeBuilder().insertCharacter(character);
        assertEquals('c', new XmlTreeBuilder().getCharacter());
    }

    @Test
    public void InsertDoctype_DoctypeIsNotNull_ThrowsNullPointerException() {
        DocumentType doctype = null;
        assertThrows(NullPointerException.class, () -> new XmlTreeBuilder().insertDoctype(doctype));
    }

    @Test
    public void InsertDoctype_DoctypeIsNotNull_InsertsDoctype() {
        DocumentType doctype = new DocumentType();
        new XmlTreeBuilder().insertDoctype(doctype);
        assertNotNull(new XmlTreeBuilder().getDoctype());
    }

}