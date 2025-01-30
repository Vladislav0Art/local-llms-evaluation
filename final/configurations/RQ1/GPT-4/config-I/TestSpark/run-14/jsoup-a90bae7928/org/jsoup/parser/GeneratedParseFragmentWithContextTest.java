package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.jsoup.Jsoup;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        try {
            XmlTreeBuilder builder = new XmlTreeBuilder();
            List<org.jsoup.nodes.Node> nodes = builder.parseFragment("<p>hello</p>", Jsoup.parse("<div>").child(0), "http://www.test.com", new Parser(builder));
            assertEquals(1, nodes.size());
        } catch (Exception e) {
            fail("Test failed due to exception: " + e.getMessage());
        }
    }

}