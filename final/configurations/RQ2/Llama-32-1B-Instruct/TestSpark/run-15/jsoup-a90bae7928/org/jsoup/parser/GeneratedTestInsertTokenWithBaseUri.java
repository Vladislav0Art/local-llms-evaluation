package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestInsertTokenWithBaseUri {

    @Test
    public void testInsertTokenWithBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<root><a>b</a></root>"), "http://example.com");
        Node root = document.getElementsByTagName("root").item(0);
        Token token = new Token.StartTag("a", null, null, null, "new_value");
        Assert.assertTrue(root.getTextContent().equals("a  new_value"));
    }

}