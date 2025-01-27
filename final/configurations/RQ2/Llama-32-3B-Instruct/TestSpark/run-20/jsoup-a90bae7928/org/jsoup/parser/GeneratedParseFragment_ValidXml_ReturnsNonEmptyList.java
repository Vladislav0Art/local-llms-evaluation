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

public class GeneratedParseFragment_ValidXml_ReturnsNonEmptyList {

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
    public void parseFragment_ValidXml_ReturnsNonEmptyList() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment("<root><child/></root>", "base URI", null, null);
        assertTrue(result.size() > 0);
    }

    @ParametersAreNonnullByDefault
    public void parse_EmptyInput_ReturnsEmptyDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document result = builder.parse(new StringReader(""), "base URI");
        assertEquals(0, result.childNodes().size());
    }

}