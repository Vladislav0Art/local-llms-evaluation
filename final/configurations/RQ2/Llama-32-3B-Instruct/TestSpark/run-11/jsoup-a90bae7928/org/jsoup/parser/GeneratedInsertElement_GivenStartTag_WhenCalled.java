package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedInsertElement_GivenStartTag_WhenCalled {

    @Test
    public void insertElement_GivenStartTag_WhenCalled() {
        // given
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag startTag = Token.StartTag.ROOT;

        // when
        Element element = builder.insert(startTag);

        // then
        assertNotNull(element);
    }

}