package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestPopStackToClose {

    @Test
    public void testPopStackToClose() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<root><a>b</a></root>"), "http://example.com");
        Token endTag = new Token.EndTag("a");
        builder.popStackToClose(endTag);
        Assert.assertTrue(document.getElementsByTagName("a").isEmpty());
    }

}