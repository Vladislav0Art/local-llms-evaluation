package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.TreeBuilder;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        String expected = "<root></root>";
        StringReader input = new StringReader(expected);
        TreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(input, StandardCharsets.UTF_8.name(), "");
        Assert.assertEquals(expected, document.toString());
    }

}