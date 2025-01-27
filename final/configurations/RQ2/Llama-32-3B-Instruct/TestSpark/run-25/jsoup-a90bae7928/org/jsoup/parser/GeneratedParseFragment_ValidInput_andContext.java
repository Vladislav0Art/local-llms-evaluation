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

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseFragment_ValidInput_andContext {

    @Test
    public void parseFragment_ValidInput_andContext() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = new Element("child");
        Reader reader = new StringReader("<root><child></child></root>");
        List<Node> nodes = builder.parseFragment(reader.toString(), element, "https://example.com", null);
        assertEquals(1, nodes.size());
    }

}