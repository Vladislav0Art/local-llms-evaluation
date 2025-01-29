package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testClearAttributes() {
        NodeList nodeList = new NodeList();
        nodeList.clearAttributes();

        // Assert that the attributes are cleared
        assert nodeList.getAttributes().isEmpty();
    }

    @Test
    public void testRemoveAttr() {
        NodeList nodeList = new NodeList();
        nodeList.removeAttr("test");

        // Assert that the attribute is removed
        assert nodeList.getAttributes().get(0).getValue() == null;
    }

    @Test
    public void testRoot() {
        NodeList nodeList = new NodeList();

        // Test that the root element returns itself
        NodeList rootNode = nodeList.root();
        assert rootNode == nodeList;

        // Test that the root can be traversed without changing it
        nodeList.traverse(nodeList);
        assert rootNode.equals(nodeList);
    }

    @Test
    public void testTraverse() {
        NodeList nodeList = new NodeList();

        // Test that the traverse method returns an empty list
        Object[] result = nodeList.traverse(null);
        assert Arrays.deepEquals(result, new Object[0]);

        // Test that the original element is returned when no action is given
        result = nodeList.traverse(nodeList);
        assert Arrays.equals(result, new Object[]{nodeList});
    }

    @Test
    public void testForEach() {
        NodeList nodeList = new NodeList();

        // Test that the forEach method returns an empty list for empty elements
        Objects[] result = nodeList.forEach(null);
        assert Arrays.deepEquals(result, new Objects[0]);

        // Test that the original element is returned when no action is given
        result = nodeList.forEach(node -> null);
        assert Arrays.equals(result, new Object[]{nodeList});
    }

    @Test
    public void testFilter() {
        NodeList nodeList = new NodeList();

        // Test that the filter method returns an empty list for no match
        Objects[] result = nodeList.filter(null);
        assert Arrays.deepEquals(result, new Object[0]);

        // Test that the original element is returned when a match is found
        result = nodeList.filter(node -> "test".equals(node.getValue()));
        assert Arrays.equals(result, new Object[]{nodeList});
    }

}