package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedProcess_GivenToken_ReturnsProcessedValue {

    @Test
    public void process_GivenToken_ReturnsProcessedValue() {
        Token token = new Token.Token("tag", "child", null, null);
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        assertTrue(treeBuilder.process(token));
    }

}