package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.Node;

public class GeneratedRunParserTests {

    @Test
    public void runParserTests() {
        Parser parser = new Parser();
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<tag>content</tag>";
        List<Node> result = builder.parse(input, null);
        builder.initialiseParse(new StringReader(input), null, parser);
        assertEquals(1, result.size());
    }

}