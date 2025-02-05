package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void addKeyValueRegularTest() {
        Attributes attrs = new Attributes();
        Attributes returnAttrs = attrs.add("key1", "value1");
        Assert.assertEquals(attrs, returnAttrs);
        Assert.assertEquals("value1", attrs.get("key1"));
    }

    @Test
    public void putKeyValueRegularTest() {
        Attributes attrs = new Attributes();
        attrs = attrs.put("key2", "value2");
        Assert.assertEquals("value2", attrs.get("key2"));
    }

    @Test
    public void putKeyValueBooleanTest() {
        Attributes attrs = new Attributes();
        attrs = attrs.put("key3", true);
        Assert.assertEquals("", attrs.get("key3"));
    }

    @Test
    public void removeKeyRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        attrs.remove("key1");
        Assert.assertFalse(attrs.hasKey("key1"));
    }

    @Test
    public void hasKeyRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        Assert.assertTrue(attrs.hasKey("key1"));
    }

    @Test
    public void sizeRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        attrs.add("key2", "value2");
        Assert.assertEquals(2, attrs.size());
    }

    @Test
    public void isEmptyRegularTest() {
        Attributes attrs = new Attributes();
        Assert.assertTrue(attrs.isEmpty());
    }

    @Test
    public void addAllRegularTest() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key1", "value1");

        Attributes attrs2 = new Attributes();
        attrs2.add("key2", "value2");

        attrs1.addAll(attrs2);
        Assert.assertTrue(attrs1.hasKey("key1") && attrs1.hasKey("key2"));
    }

    @Test
    public void asListRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");

        List<Attribute> attrsList = attrs.asList();

        Assert.assertEquals(1, attrsList.size());
        for (Attribute attribute : attrsList) {
            Assert.assertEquals("key1", attribute.getKey());
            Assert.assertEquals("value1", attribute.getValue());
        }
    }

    @Test
    public void datasetRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        Map<String, String> dataset = attrs.dataset();
        Assert.assertEquals(1, dataset.size());
        Assert.assertEquals("value1", dataset.get("key1"));
    }

    @Test
    public void cloneTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        Attributes cloned = attrs.clone();

        Assert.assertEquals(attrs, cloned);
        Assert.assertNotSame(attrs, cloned);
    }

}