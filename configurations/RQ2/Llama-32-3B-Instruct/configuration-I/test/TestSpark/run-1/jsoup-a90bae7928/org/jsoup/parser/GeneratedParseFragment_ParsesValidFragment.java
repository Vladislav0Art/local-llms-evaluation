package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedParseFragment_ParsesValidFragment {

    @Test
    public void parseFragment_ParsesValidFragment() throws IOException {
        String xml = "<html><body>Hello World!</body></html>";
        List<Node> nodes = new XmlTreeBuilder().parseFragment(new StringReader(xml), "baseUri", null);
        assertEquals(2, nodes.size());
    }

}