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

public class GeneratedParseFragmentInputFragmentOnlyTest {

    @Test
    public void parseFragmentInputFragmentOnlyTest() {
        String inputFragment = "<node>Text</node>";
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        List<Node> nodes = XmlTreeBuilderTest().initialiseParse(new StringReader(inputFragment), baseUri, parser).parseFragment(inputFragment, baseUri, parser);
        assertEquals(1, nodes.size());
    }

}