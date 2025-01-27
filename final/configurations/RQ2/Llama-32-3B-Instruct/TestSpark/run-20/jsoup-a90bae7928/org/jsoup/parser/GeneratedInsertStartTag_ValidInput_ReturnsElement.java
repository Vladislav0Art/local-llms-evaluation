package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

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

public class GeneratedInsertStartTag_ValidInput_ReturnsElement {

    @ParametersAreNonnullByDefault
    public void parseFragment_EmptyFragment_ReturnsEmptyList() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment("", "", null, null);
        assertEquals(0, result.size());
    }

    @ParametersAreNonnullByDefault
    public void parseFragment_InvalidXml_ThrowsException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        try {
            builder.parseFragment("<invalid xml>", "base URI", null, null);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void insertStartTag_ValidInput_ReturnsElement() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = builder.insert(Token.StartTag.START_TAG);
        assertNotNull(element);
        assertEquals(START_TAG, element.tagName());
    }

}