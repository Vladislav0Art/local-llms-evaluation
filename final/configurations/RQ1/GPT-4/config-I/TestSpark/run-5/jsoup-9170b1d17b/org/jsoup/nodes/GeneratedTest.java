package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedTest {

    @Test
    public void getAttributesSizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        Assert.assertEquals(1, attributes.size());
    }

    @Test
    public void addAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        Assert.assertTrue(attributes.hasKey("attr1"));
        Assert.assertEquals("value1", attributes.get("attr1"));
    }

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        attributes.remove("attr1");
        Assert.assertFalse(attributes.hasKey("attr1"));
    }

    @Test
    public void objectsEqualityTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("attr1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add("attr1", "value1");

        Attributes attributes3 = new Attributes();
        attributes3.add("attr2", "value2");

        Assert.assertEquals(attributes1, attributes2);
        Assert.assertNotEquals(attributes1, attributes3);
    }

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        Assert.assertEquals("attr1=\"value1\"", attributes.toString());
    }

    @Test
    public void emptyAttributesListTest() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(attributes.isEmpty());
    }

    @Test
    public void nonEmptyAttributesListTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        Assert.assertFalse(attributes.isEmpty());
    }

    @Test
    public void cloneAttributesTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");

        Attributes clonedAttributes = attributes.clone();
        Assert.assertEquals(attributes, clonedAttributes);
    }

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        attributes.add("attr2", "value2");

        Iterator<Attribute> iterator = attributes.iterator();

        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("attr1", iterator.next().getKey());
        Assert.assertEquals("attr2", iterator.next().getKey());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void removeIteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        attributes.add("attr2", "value2");

        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        Assert.assertEquals(0, attributes.size());
    }

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("attr1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add("attr2", "value2");

        attributes1.addAll(attributes2);

        Assert.assertEquals(2, attributes1.size());
        Assert.assertTrue(attributes1.hasKey("attr1"));
        Assert.assertTrue(attributes1.hasKey("attr2"));
    }

    @Test
    public void htmlOutputTest() throws Exception {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        String htmlOutput = attributes.html();
        Assert.assertTrue(htmlOutput.contains("attr1=\"value1\""));
    }

}