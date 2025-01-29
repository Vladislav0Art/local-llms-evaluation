package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertToken {

    @Test
    public void testInsertToken() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<root><a>b</a></root>"), "http://example.com");
        Node root = document.getElementsByTagName("root").item(0);
        Token token = new Token.StartTag("a", "new value", null, null, null);
        Assert.assertTrue(root.getTextContent().equals("a  new value"));
    }

}