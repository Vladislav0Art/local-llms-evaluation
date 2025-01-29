package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CommentNode;
import org.jsoup.nodes.DocumentNode;
import org.jsoup.nodes.ElementNode;
import org.jsoup.nodes.NodeContext;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tree;
import org.junit.jupiter.api.Test;

public class GeneratedParseFragmentWithNonEmptyString {

    @Test
    public void parseFragmentWithNonEmptyString() {
        ElementDocument doc = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(doc, null);
        Assert.assertTrue(instance.parseFragment("foo", "baseUri", null));
    }

}