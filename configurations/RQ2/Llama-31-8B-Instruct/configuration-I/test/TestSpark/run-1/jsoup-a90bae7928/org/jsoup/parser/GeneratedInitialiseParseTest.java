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
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Character;
import org.jsoup.nodes.Doctype;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.XmlTreeBuilder;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<root>");
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        xmlTreeBuilder.initialiseParse(input, baseUri, parser);
    }

}