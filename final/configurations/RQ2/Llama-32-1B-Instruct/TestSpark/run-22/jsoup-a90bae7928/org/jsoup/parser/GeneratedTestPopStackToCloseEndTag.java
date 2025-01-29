package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestPopStackToCloseEndTag {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testPopStackToCloseEndTag() throws IOException {
        String content = "<html><body>Hello World!</body></html>";
        Document document = createDocument(content);
        XmlTreeBuilder instance = new XmlTreeBuilder();
        assert !instance.popStackToClose(new Token.EndTag("html")).isEmpty();
    }

}