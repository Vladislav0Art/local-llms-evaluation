package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addKeyValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        Assert.assertEquals("value1", attrs.get("key1"));
    }

    @Test
    public void putKeyValueTest() {
        Attributes attrs = new Attributes();
        attrs.put("key2", "value2");
        Assert.assertEquals("value2", attrs.get("key2"));
    }

    @Test
    public void putAttributeTest() {
        Attributes attrs = new Attributes();
        attrs.put(new Attribute("key3", "value3"));
        Assert.assertEquals("value3", attrs.get("key3"));
    }

    @Test
    public void removeKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key4", "value4");
        attrs.remove("key4");
        Assert.assertEquals("", attrs.get("key4"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key5", "value5");
        Assert.assertTrue(attrs.hasKey("key5"));
        Assert.assertFalse(attrs.hasKey("key6"));
    }

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key7", "value7");
        Assert.assertEquals(1, attrs.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes attrs = new Attributes();
        Assert.assertTrue(attrs.isEmpty());
    }

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key8", "value8");

        Attributes attrs2 = new Attributes();
        attrs2.put("key9", "value9");

        attrs1.addAll(attrs2);
        Assert.assertEquals("value8", attrs1.get("key8"));
        Assert.assertEquals("value9", attrs1.get("key9"));
    }

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();
        attrs.put("key10", "value10");
        Assert.assertTrue(attrs.iterator().hasNext());
    }

    @Test
    public void asListTest() {
        Attributes attrs = new Attributes();
        attrs.put("key11", "value11");
        Assert.assertEquals(1, attrs.asList().size());
    }

    @Test
    public void datasetTest() {
        Attributes attrs = new Attributes();
        attrs.put("data-key12", "value12");
        Assert.assertEquals("value12", attrs.dataset().get("key12"));
    }

    @Test
    public void htmlTest() {
        Attributes attrs = new Attributes();
        attrs.put("key13", "value13");
        Assert.assertEquals("key13=\"value13\"", attrs.html());
    }

    @Test
    public void toStringTest() {
        Attributes attrs = new Attributes();
        attrs.put("key14", "value14");
        Assert.assertEquals("key14=\"value14\"", attrs.toString());
    }

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        Attributes attrs2 = new Attributes();
        attrs1.put("key15", "value15");
        attrs2.put("key15", "value15");
        Assert.assertTrue(attrs1.equals(attrs2));
    }

    @Test
    public void hashCodeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key16", "value16");
        int expectedHashCode = attrs.hashCode();
        attrs.put("key17", "value17");
        Assert.assertNotEquals(expectedHashCode, attrs.hashCode());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attrs = new Attributes();
        attrs.put("key18", "value18");
        Attributes clonedAttrs = attrs.clone();
        Assert.assertNotSame(attrs, clonedAttrs);
        Assert.assertEquals(attrs, clonedAttrs);
    }

}