package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestPopStackToCloseDoctypeToken {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testPopStackToCloseDoctypeToken() throws IOException {
        String content = "<!DOCTYPE html><html><body>Hello World!</body></html>";
        Document document = createDocument(content);
        XmlTreeBuilder instance = new XmlTreeBuilder();
        assert !instance.popStackToClose(new Token.Doctype("html")).isEmpty();
    }

}