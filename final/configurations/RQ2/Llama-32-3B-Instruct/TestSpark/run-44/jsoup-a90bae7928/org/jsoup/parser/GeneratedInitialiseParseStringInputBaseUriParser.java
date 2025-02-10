package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;

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
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Token;

public class GeneratedInitialiseParseStringInputBaseUriParser {

    @Test
    public void initialiseParseStringInputBaseUriParser() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";
        Parser parser = null;
        builder.initialiseParse(input, baseUri, parser);
    }

}