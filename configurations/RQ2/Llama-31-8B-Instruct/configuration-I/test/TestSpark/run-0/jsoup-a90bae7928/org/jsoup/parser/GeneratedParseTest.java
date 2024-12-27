package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Character;
import org.jsoup.nodes.Doctype;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.XmlTreeBuilder;

import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedParseTest {

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";
        Document document = xmlTreeBuilder.parse(input, baseUri);
        assertNotNull(document);
    }

}