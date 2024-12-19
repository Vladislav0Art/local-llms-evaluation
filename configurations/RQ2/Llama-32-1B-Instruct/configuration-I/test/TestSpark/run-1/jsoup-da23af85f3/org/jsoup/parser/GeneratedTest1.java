package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTest1 {

    @Test
    public void test1() {
        String node1 = "<p>This is the first paragraph</p>";
        String node2 = "<p>This is the second paragraph</p>";
        Parser parser = new Parser();
        String[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

}