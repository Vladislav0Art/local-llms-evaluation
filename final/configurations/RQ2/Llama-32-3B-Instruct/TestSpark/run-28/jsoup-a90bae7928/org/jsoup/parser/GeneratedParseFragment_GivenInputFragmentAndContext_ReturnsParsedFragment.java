package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedParseFragment_GivenInputFragmentAndContext_ReturnsParsedFragment {

    @Test
    public void parseFragment_GivenInputFragmentAndContext_ReturnsParsedFragment() {
        String inputFragment = "<xml><root/></xml>";
        Element context = new Element.Element("child");
        String baseUri = "http://example.com";
        Parser parser = new Parser();
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> parsedFragment = treeBuilder.parseFragment(inputFragment, context, baseUri, parser);
        assertNotNull(parsedFragment);
    }

}