package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedParseFragment_ParsesEmptyFragment {

    @Test
    public void parseFragment_ParsesEmptyFragment() throws IOException {
        List<Node> nodes = new XmlTreeBuilder().parseFragment(new StringReader(""), "baseUri", null);
        assertTrue(nodes.isEmpty());
    }

}