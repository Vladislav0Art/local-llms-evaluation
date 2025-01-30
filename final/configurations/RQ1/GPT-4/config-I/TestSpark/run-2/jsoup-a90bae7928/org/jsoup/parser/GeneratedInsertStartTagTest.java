package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "sample";
        Element element = xmlTreeBuilder.insert(startTag);
        assertEquals("sample", element.tagName());
    }

}