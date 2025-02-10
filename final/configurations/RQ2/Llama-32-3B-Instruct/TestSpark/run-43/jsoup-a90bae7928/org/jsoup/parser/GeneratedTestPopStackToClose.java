package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.junit.Test;

public class GeneratedTestPopStackToClose {

    @Test
    public void testPopStackToClose() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token endTag = new XmlTreeBuilder.Token(XmlTreeBuilder.Token.Type.EndTag, "</child>");
        builder.popStackToClose(endTag);
    }

}