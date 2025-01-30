package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void getExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
    }

    @Test
    public void getNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        Assert.assertEquals("", attrs.get("key"));
    }

    @Test
    public void getIgnoreCaseExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals("value", attrs.getIgnoreCase("KEY"));
    }

    @Test
    public void getIgnoreCaseNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        Assert.assertEquals("", attrs.getIgnoreCase("KEY"));
    }

    @Test
    public void addTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
    }

    @Test
    public void putExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        attrs.put("key", "newVal");
        Assert.assertEquals("newVal", attrs.get("key"));
    }

    @Test
    public void putNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
    }

    @Test
    public void removeExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        attrs.remove("key");
        Assert.assertEquals("", attrs.get("key"));
    }

    @Test
    public void removeNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.remove("key");
        Assert.assertEquals("", attrs.get("key"));
    }

    @Test
    public void hasKeyExistentKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Assert.assertTrue(attrs.hasKey("key"));
    }

    @Test
    public void hasKeyNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        Assert.assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void hashCodeSameAttrsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.put("key", "value");

        Assert.assertEquals(attrs1.hashCode(), attrs2.hashCode());
    }

    @Test
    public void equalsSameAttrsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.put("key", "value");

        Assert.assertTrue(attrs1.equals(attrs2));
    }

    @Test
    public void equalsDifferentAttrsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value2");

        Assert.assertFalse(attrs1.equals(attrs2));
    }

}