package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestParseFragmentDoctypeToken {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testParseFragmentDoctypeToken() throws IOException {
        String fragmentContent = "<!DOCTYPE html><html><body>Hello World!</body></html>";
        List<Node> nodes = parseFragment(fragmentContent, "", new Parser());
        assert !nodes.isEmpty();
        Document document = createDocument(nodes.get(0));
        assert document.getElementById("root").getElementsByTagName("html").size().equals(1);
    }

}