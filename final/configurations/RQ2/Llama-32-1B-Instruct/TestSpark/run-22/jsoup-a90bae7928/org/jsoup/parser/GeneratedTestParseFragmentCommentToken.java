package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestParseFragmentCommentToken {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testParseFragmentCommentToken() throws IOException {
        String fragmentContent = "<!-- This is a comment -->";
        List<Node> nodes = parseFragment(fragmentContent, "", new Parser());
        assert !nodes.isEmpty();
        Document document = createDocument(nodes.get(0));
        assert document.getElementById("root").getElementsByTagName("p").size().equals(1);
    }

}