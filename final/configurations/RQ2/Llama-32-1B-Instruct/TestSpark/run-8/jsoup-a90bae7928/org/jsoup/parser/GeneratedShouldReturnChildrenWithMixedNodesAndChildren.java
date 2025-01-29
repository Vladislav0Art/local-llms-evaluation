package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedShouldReturnChildrenWithMixedNodesAndChildren {

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

        String input1 = "<a><b>";
        JsoupParser.Node node1 = JsoupParser.Parse_Fragment_NoBaseUri(input1);
        JsoupParser.Node[] children1 = JsoupParser.Parse_Fragment(node1);

        fail("Expected Parse_Fragment_NoBaseUri(String) to return a root node with mixed nodes");
        System.out.println(children1[0].toString());

        String input2 = "<a></a>";
        JsoupParser.Node node2 = JsoupParser.Parse_Fragment_NoBaseUri(input2);
        JsoupParser.Node[] children2 = JsoupParser.Parse_Fragment(node2);

        fail("Expected Parse_Fragment_NoBaseUri(String) to return a root node with mixed nodes");
        System.out.println(children2[0].toString());
    }

    @Test
    public void shouldReturnChildrenWithMixedNodesAndChildren() {
        String input1 = "<a><b></b>";
        JsoupParser.Node[] children1 = JsoupParser.Parse_Fragment_NoBaseUri(input1);

        fail("Expected Parse_Fragment_NoBaseUri(String) to return an array of child nodes");
        for (JsoupParser.Node node : children1) {
            System.out.println(node.toString());
        }
    }

}