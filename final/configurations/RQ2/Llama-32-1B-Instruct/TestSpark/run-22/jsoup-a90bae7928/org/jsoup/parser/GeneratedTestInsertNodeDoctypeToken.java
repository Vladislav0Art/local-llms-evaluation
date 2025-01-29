package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestInsertNodeDoctypeToken {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testInsertNodeDoctypeToken() throws IOException {
        String fragmentContent = "<!DOCTYPE html><html><body>Hello World!</body></html>";
        List<Node> nodes = new ArrayList<>();
        nodes.add(createDocument(nodes.get(0)));
        Document document = createDocument(nodes.get(0));
        XmlTreeBuilder instance = new XmlTreeBuilder();
        instance.insert(document.getElementById("root").getElementsByTagName("html").firstNodeChild);
    }

}