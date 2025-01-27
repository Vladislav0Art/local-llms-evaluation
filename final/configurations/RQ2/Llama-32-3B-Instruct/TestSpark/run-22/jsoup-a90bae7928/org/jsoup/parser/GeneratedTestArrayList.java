package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestArrayList {

    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

import org.junit.Test;

public class ListTest {

    @Test
    public void testArrayList() {
        List<Node> list = new ArrayList<>();
        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        list.add(node1);
        list.add(node2);
        assertEquals(2, list.size());

        for (Object obj : list) {
            Node node = (Node) obj;
            assertEquals("node1", node.getName());
        }
    }

    public void testArrayListAlternative() {
        List<Node> list = new ArrayList<>();
        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        list.add(node1);
        list.add(node2);
        assertEquals(2, list.size());

        for (Object obj : list) {
            Object o = obj;
            if (o instanceof Node) {
                Node node = (Node) o;
                assertEquals("node1", node.getName());
            }
        }
    }

}