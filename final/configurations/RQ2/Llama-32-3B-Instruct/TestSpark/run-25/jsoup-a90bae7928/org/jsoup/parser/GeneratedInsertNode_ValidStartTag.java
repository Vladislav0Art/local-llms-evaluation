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

public class GeneratedInsertNode_ValidStartTag {

    @Test
    public void insertNode_ValidStartTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token(Token.StartTag, "<child></child>");
        Element element = new Element("child");
        builder.insertNode(element);
        assertEquals(1, builder.children().size());
    }

}