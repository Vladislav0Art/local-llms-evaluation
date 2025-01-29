package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CommentNode;
import org.jsoup.nodes.DocumentNode;
import org.jsoup.nodes.ElementNode;
import org.jsoup.nodes.NodeContext;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tree;
import org.junit.jupiter.api.Test;

public class GeneratedParseTokenStartTag {

    @Test
    public void parseTokenStartTag() {
        ElementDocument element = new Document();
        Tree tree = new Tree();
        XmlTreeBuilder instance = new XmlTreeBuilder(tree, element);
        assertElementEquals(element, instance.insertNode(Token.StartTag.class), 0);
    }

}