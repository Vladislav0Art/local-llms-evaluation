package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentInputBaseUriParserTest {

    @Test
    public void parseFragmentInputBaseUriParserTest() {
        String inputFragment = "<xml>Test content</xml>";
        String baseUri = "http://example.com";
        Parser parser = Parser.xmlParser();

        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser);

        Assert.assertFalse(nodes.isEmpty());
    }

}