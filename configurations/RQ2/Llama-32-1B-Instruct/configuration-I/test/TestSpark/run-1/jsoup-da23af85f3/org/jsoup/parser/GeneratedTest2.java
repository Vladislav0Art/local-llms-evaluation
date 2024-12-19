package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTest2 {

    @Test
    public void test2() {
        String node1 = "<p>This is the first paragraph</p>";
        String node2 = "<p>This is the second paragraph</p>";
        Parser parser = new Parser();
        Node[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

}