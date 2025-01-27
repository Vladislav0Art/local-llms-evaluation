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

public class GeneratedInitialiseParse_ValidReaderAndUri_MustInitialize {

    public class Parser {
        private TreeBuilder treeBuilder;

        public Parser(TreeBuilder treeBuilder) {
            this.treeBuilder = treeBuilder;
        }

        // ... other methods ...
    }

    @Test
    public void initialiseParse_ValidReaderAndUri_MustInitialize() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = new StringReader("<html><body>Hello World!</body></html>");
        String baseUri = "http://example.com";
        Parser parser = new Parser(builder);
        builder.initialiseParse(reader, baseUri, parser);
    }

}