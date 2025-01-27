package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedParseFragment_GivenInputFragmentAndBaseUri_ReturnsParsedFragment {

    @Test
    public void parseFragment_GivenInputFragmentAndBaseUri_ReturnsParsedFragment() {
        String inputFragment = "<xml><root/></xml>";
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> parsedFragment = treeBuilder.parseFragment(inputFragment, baseUri, parser);
        assertNotNull(parsedFragment);
    }

}