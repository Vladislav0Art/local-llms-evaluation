package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestInsertNodeCharacterToken {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testInsertNodeCharacterToken() throws IOException {
        String content = "<p>This is a paragraph.</p>";
        Document document = parse(content);
        assert document.getElementById("root").getElementsByTagName("p").firstNodeChild.text().equals("This is a paragraph.");
    }

}