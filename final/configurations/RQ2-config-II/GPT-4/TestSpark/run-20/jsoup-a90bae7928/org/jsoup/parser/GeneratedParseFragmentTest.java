package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<root><child/></root>";
        List<Node> nodes = builder.parseFragment(input, "http://example.com", Parser.xmlParser());
        assertEquals(1, nodes.size());
    }

}