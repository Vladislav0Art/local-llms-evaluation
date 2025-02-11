package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.TextNode;

import java.io.Reader;
import java.util.List;

public class GeneratedParseFragment_WithEmptyInputAndBaseUriCallsParse {

    @Test
    public void parseFragment_WithEmptyInputAndBaseUriCallsParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment("", "http://example.com", null);
        assertNotNull(result);
    }
}

class TagCounters {
    private static final int[] TAGS = new int[256];

    public static void increment(int index) {
        TAGS[index]++;
    }

    public static int get(int index) {
        return TAGS[index];
    }

}