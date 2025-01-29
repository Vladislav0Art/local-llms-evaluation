package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CommentNode;
import org.jsoup.nodes.DocumentNode;
import org.jsoup.nodes.ElementNode;
import org.jsoup.nodes.NodeContext;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tree;
import org.junit.jupiter.api.Test;

public class GeneratedInitialiseParseDefaultSettings {

    @Test
    public void initialiseParseDefaultSettings() {
        ElementDocument element = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(element, null);
        Assert.assertTrue(instance.initialiseParse(new StringReader("<!-- foo -->"), null, null));
    }

}