package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;

public class GeneratedTest {

    @Test
    public void test1() {
        String node1 = "<p>This is the first paragraph</p>";
        String node2 = "<p>This is the second paragraph</p>";
        Parser parser = new Parser();
        String[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

    @Test
    public void test2() {
        String node1 = "<p>This is the first paragraph</p>";
        String node2 = "<p>This is the second paragraph</p>";
        Parser parser = new Parser();
        Node[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

    @Test
    public void test3() {
        String node1 = "<script>console.log('Hello World');</script>";
        String node2 = "<p>This is the first paragraph</p>";
        Parser parser = new Parser();
        Node[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

    @Test
    public void test4() {
        String node1 = "<script>console.log('Hello World');</script>";
        String node2 = "<p>This is the second paragraph</p>";
        Parser parser = new Parser();
        Node[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

    @Test
    public void test5() {
        String node1 = "<script>console.log('Hello World');</script>";
        String node2 = "<p>This is the third paragraph</p>";
        Parser parser = new Parser();
        Node[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

    @Test
    public void test6() {
        String node1 = "<script>console.log('Hello World');</script>";
        String node2 = "<p>This is the fourth paragraph</p>";
        Parser parser = new Parser();
        Node[] nodes = parser.process(node1, node2);
        System.out.println(nodes[0].toString());
    }

}