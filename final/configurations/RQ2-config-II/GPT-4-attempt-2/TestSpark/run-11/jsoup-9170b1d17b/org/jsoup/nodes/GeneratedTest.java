package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void addKeyAndValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
    }

    @Test
    public void putKeyAndValueTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
    }

    @Test
    public void removeKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.remove("key");
        Assert.assertEquals("", attrs.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertTrue(attrs.hasKey("key"));
    }

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertTrue(attrs.hasDeclaredValueForKey("key"));
    }

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
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
        attrs1.add("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.add("newKey", "newValue");

        attrs1.addAll(attrs2);
        Assert.assertTrue(attrs1.hasKey("newKey"));
    }

    @Test
    public void iteratorTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertTrue(attrs.iterator().hasNext());
    }

    @Test
    public void asListTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        List<Attribute> list = attrs.asList();
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void datasetTest() {
        Attributes attrs = new Attributes();
        attrs.put("data-key", "value");
        Map<String, String> dataset = attrs.dataset();
        Assert.assertEquals(1, dataset.size());
    }

    @Test
    public void htmlTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        String html = attrs.html();
        Assert.assertEquals(" key=\"value\"", html);
    }

    @Test
    public void toStringTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals(" key=\"value\"", attrs.toString());
    }

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.add("key", "value");

        Assert.assertEquals(attrs1, attrs2);
    }

    @Test
    public void cloneTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Attributes clonedAttrs = attrs.clone();
        Assert.assertEquals(attrs, clonedAttrs);
    }

    @Test
    public void normalizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        attrs.normalize();
        Assert.assertEquals("value", attrs.get("key"));
    }

    @Test
    public void deduplicateTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value1");
        attrs.add("key", "value2");

        attrs.deduplicate(ParseSettings.preserveCase);
        Assert.assertEquals(1, attrs.size());
    }

}