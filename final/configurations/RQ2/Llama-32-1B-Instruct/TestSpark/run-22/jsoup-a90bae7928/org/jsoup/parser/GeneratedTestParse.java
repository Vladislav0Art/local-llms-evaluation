package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestParse {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testParse() throws IOException {
        String content = "<html><body>Hello World!</body></html>";
        Document document = parse(content);
        assert document.getElementById("root").text().equals("Hello World!");
    }

}