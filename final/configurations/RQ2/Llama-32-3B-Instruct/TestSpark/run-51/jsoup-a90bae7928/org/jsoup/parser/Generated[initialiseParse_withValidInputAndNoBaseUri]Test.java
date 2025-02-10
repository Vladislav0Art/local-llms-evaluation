package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

import java.io.Reader;
import java.io.StringReader;

public class Generated[initialiseParse_withValidInputAndNoBaseUri]

Test {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void [initialiseParse_withValidInputAndNoBaseUri]Test() throws Exception {
        Reader input = new StringReader("<element></element>");
        xmlTreeBuilder.initialiseParse(input, null, null);
        assertNotNull(xmlTreeBuilder.parse(new StringReader("<element></element>"), "baseUri"));
    }

}