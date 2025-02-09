package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "test";

        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = builder.insert(startTag);

        assertNotNull(element);
        // evaluates that the inserted tag is present in the document
        assertEquals("test", element.tagName());
    }

}