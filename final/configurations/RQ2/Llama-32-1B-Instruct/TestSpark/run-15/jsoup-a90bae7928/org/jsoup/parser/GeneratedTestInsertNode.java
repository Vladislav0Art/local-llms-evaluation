package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertNode {

    @Test
    public void testInsertNode() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<root><a>b</a></root>"));
        Node root = document.getElementsByTagName("root").item(0);
        builder.insert(root, new Token.Comment("new comment", "comment_text"));
        Assert.assertTrue(root.getTextContent().equals("new comment comment_text"));
    }

}