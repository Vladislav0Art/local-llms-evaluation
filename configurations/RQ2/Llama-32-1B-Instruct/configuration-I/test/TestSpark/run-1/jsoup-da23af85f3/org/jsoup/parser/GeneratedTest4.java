package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTest4 {

    @Test
    public void test4() {
        String node1 = "<script>console.log('Hello World');</script>";
        String node2 = "<p>This is the second paragraph</p>";
        Parser parser = new Parser();
        Node[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

}