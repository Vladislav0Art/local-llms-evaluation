package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestPopStackToCloseCommentToken {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testPopStackToCloseCommentToken() throws IOException {
        String content = "<!-- This is a comment -->";
        Document document = createDocument(content);
        XmlTreeBuilder instance = new XmlTreeBuilder();
        assert !instance.popStackToClose(new Token.Comment("<!--")).isEmpty();
    }

}