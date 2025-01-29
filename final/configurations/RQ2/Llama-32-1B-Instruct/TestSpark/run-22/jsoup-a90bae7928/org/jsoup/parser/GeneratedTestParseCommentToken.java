package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestParseCommentToken {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testParseCommentToken() throws IOException {
        String content = "<p>This is a paragraph.</p>";
        Document document = parse(content);
        assert document.getElementById("root").getElementsByTagName("p").size().equals(1);
    }

}