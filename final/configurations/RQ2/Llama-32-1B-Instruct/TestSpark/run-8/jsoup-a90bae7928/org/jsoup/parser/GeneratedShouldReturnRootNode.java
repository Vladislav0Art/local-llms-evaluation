package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedShouldReturnRootNode {

    public static String Parse_Fragment_NoBaseUri(String input) {
        Document document = Jsoup.parse(input);
        return document.body().text();
    }

    public static Node[] Parse_Fragment(Node node) {
        return new Node[]{node};
    }
}

class GeneratedTest extends Test {
    @Override
    protected void setUp() throws Exception {
        super.setUp();

        String input = "<a><b>";
    }

    @Test
    public void shouldReturnRootNode() {
        // Arrange
        JsoupParser.Node node1 = Parse_Fragment_NoBaseUri(input);
        Node node2 = Parse_Fragment_NoBaseUri(node1);

        fail("Expected Parse_Fragment_NoBaseUri(String) to return a root node");
        System.out.println(node1.toString());
    }

}