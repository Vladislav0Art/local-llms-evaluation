package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertNodeWithTokenAndBaseUri {

    @Test
    public void testInsertNodeWithTokenAndBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<root><a>b</a></root>"), "http://example.com");
        Node root = document.getElementsByTagName("root").item(0);
        builder.insert(root, new Token.StartTag("a"));
        Assert.assertTrue(root.getTextContent().equals("a b"));
    }

}