package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.util.List;

public class GeneratedParseFragmentInputFragmentAndContextOnlyTest {

    @Test
    public void parseFragmentInputFragmentAndContextOnlyTest() {
        String inputFragment = "<node>Text</node>";
        Element context = new Element();
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        List<Node> nodes = XmlTreeBuilderTest().initialiseParse(new StringReader(inputFragment), baseUri, parser).parseFragment(inputFragment, context, baseUri, parser);
        assertEquals(1, nodes.size());
    }

}