package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestInsertNode {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testInsertNode() throws IOException {
        String fragmentContent = "<div><span>This is a span.</span></div>";
        List<Node> nodes = new ArrayList<>();
        nodes.add(createDocument(nodes.get(0)));
        Document document = createDocument(nodes.get(0));
        XmlTreeBuilder instance = new XmlTreeBuilder();
        instance.insert(document.getElementById("root").getElementsByTagName("p").firstNodeChild);
        assert document.getElementById("root").getElementsByTagName("span").size().equals(1);
    }

}