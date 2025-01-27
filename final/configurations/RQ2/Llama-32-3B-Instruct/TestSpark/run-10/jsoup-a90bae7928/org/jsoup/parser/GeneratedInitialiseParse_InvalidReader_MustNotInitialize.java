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

public class GeneratedInitialiseParse_InvalidReader_MustNotInitialize {

    @Test
    public void initialiseParse_InvalidReader_MustNotInitialize() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = null;
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        boolean initialised = false;
        builder.initialiseParse(reader, baseUri, parser);
        assertTrue(initialised);
    }

}