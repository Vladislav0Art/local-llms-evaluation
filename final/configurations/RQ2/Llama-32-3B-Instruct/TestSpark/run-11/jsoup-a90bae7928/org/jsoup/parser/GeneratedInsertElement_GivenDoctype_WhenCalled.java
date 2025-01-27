package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedInsertElement_GivenDoctype_WhenCalled {

    @Test
    public void insertElement_GivenDoctype_WhenCalled() {
        // given
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Doctype doctypeToken = Token.Doctype.ROOT;

        // when
        builder.insert(doctypeToken);

        // then
        assertTrue(builder.process(doctypeToken) == true);
    }

}