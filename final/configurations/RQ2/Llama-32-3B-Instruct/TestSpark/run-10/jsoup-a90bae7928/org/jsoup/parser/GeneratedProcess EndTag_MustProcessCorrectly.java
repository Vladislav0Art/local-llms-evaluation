package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
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

public class GeneratedProcess EndTag_MustProcessCorrectly {

    @Test
    public void process

    EndTag_MustProcessCorrectly() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token endTag = new Token().setStartTag(false).setEndTag(true);
        assertTrue(builder.process(endTag));
    }

}