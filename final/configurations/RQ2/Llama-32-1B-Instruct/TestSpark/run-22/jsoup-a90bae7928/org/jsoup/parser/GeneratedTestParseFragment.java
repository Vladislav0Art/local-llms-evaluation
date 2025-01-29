package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestParseFragment {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testParseFragment() throws IOException {
        String fragmentContent = "<p>This is a paragraph.</p>";
        List<Node> nodes = parseFragment(fragmentContent, "", new Parser());
        assert !nodes.isEmpty();
        Document document = createDocument(nodes.get(0));
        assert document.getElementById("root").text().equals("This is a paragraph.");
    }

}