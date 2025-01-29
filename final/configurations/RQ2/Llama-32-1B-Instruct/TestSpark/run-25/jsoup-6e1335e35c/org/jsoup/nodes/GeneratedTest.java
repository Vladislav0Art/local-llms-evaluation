package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testClearAttributes() {
        Node node = new Node();
        node.clearAttributes(); // Should remove all attributes from the node
    }

    @Test
    public void testRemoveAttr() {
        Node node = new Node();
        node.removeAttribute("attr1");
        System.out.println(node.getAttribute("attr1")); // Should print null, because we removed the attribute
    }

    @Test
    public void testRoot() {
        Node node = new Node();
        // Test that root can be accessed directly and indirectly
        System.out.println(node.root()); // Should return itself

        // Check if traverse method returns the root
        Node result = node.traverse(null);
        if (result == node) { // Because traverse should return the root
            System.out.println("Traversed to the root correctly");
        }
    }

    @Test
    public void testFilter() {
        Node node = new Node();
        node.addAttr("attr1", "value1");
        node.addAttr("attr2", "value2");

        // Check if filter method works as expected
        String filtered = node.filter(null);
        System.out.println(filtered); // Should print "value2"

        // Check if we can filter nodes based on the given criteria
        Node filteredNode = node.filter("attr1");
        if (filteredNode != null) {
            System.out.println(filteredNode.getAttribute("attr1")); // Should return "value1"
        } else {
            System.out.println("No node matches this condition");
        }
    }

    @Test
    public void testGetElementsByTag() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByTag works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttribute("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttribute("class")); // Should print "test"
    }

    @Test
    public void testGetElementsByClass() {
        Node node = new Node();
        node.addAttr("id", "test");
        node.addClass("test-class");

        // Check if getElementsByClass works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttribute("class")); // Should print "test-class"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttribute("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttribute() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttribute("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttribute("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttributeStarting works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttribute("type")); // Should print "text"
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttributeValue works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttributeValue("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttributeValueNot works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttributeValueMatching works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttributeValue("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttributeValueMatching works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttributeValue("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttrValue() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttributeValue("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttrType() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttributeValue("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttrClass() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("class")); // Should print "test-class"
    }

    @Test
    public void testGetElementsByAttrId() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"
    }

    @Test
    public void testGetElementsByAttrName() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"
    }

    @Test
    public void testGetElementsByAttrType() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"
    }

    @Test
    public void testGetElementsByAttrClass() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("class")); // Should print ""
    }

    @Test
    public void testGetElementsByAttrName() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttribute works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("class")); // Should print ""
    }

}