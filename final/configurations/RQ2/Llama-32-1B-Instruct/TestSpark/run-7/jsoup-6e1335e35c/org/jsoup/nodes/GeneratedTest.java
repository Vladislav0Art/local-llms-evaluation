package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testClearAttributes() {
        String attributes = "class='old-class'";
        String updatedClassAttribute = getUpdatedClassAttribute(attributes);
        assertEquals("new-class", updatedClassAttribute);
    }

    @Test
    public void testRemoveAttr() {
        String attrKey = "my-attr";
        String updatedAttrValue = removeAttr(attrKey);
        assertEquals("", updatedAttrValue);
    }

    @Test
    public void testGetUpdatedClassAttribute() {
        String attributes = "class='old-class'";
        Node node = new Node();
        String updatedClassAttribute = getUpdatedClassAttribute(attributes, node);
        assertEquals("new-class", updatedClassAttribute);
    }

    @Test
    public void testGetNewClassAttribute() {
        String attrKey = "my-attr";
        String value = newClass();
        String newValueValue = getNewClassAttribute(attrKey, value);
        assertEquals(value, newValueValue);
    }

    @Test
    public void testRemoveClass() {
        String classAttr = "class='old-class'";
        Node node = new Node();
        updatedClassAttr = removeClass(classAttr, node);
        assertEquals("new-class", updatedClassAttr);
    }

    @Test
    public void testShallowClone() {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.node = "node1";
        node2.node = node1;
        shallowClone(node2, node1);
        assertEquals("node1", node2.node);
    }

    @Test
    public void testDoClone() {
        // do not call doClone as it is only for convenience
    }

}