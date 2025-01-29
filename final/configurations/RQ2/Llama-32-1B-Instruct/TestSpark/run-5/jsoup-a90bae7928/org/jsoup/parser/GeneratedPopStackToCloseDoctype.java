package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CommentNode;
import org.jsoup.nodes.DocumentNode;
import org.jsoup.nodes.ElementNode;
import org.jsoup.nodes.NodeContext;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tree;
import org.junit.jupiter.api.Test;

public class GeneratedPopStackToCloseDoctype {

    @Test
    public void popStackToCloseDoctype() {
        ElementDocument doc = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(doc, null);
        Token token = new Token(Token.Doctype, "foo", new StringReader("bar"));
        assertElementEquals(doc, instance.popStackToClose(token), 0);
    }

}