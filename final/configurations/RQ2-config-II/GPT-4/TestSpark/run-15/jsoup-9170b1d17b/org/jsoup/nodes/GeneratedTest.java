package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addNormalScenarioTest() {
        Attributes att = new Attributes();
        att.add("key", "value");
        Assert.assertEquals("value", att.get("key"));
    }

    @Test
    public void putNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        Assert.assertEquals("value", att.get("key"));
    }

    @Test
    public void putBooleanNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("boolean", true);
        Assert.assertEquals("", att.get("boolean"));
    }

    @Test
    public void putAttributeNormalScenarioTest() {
        Attributes att = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        att.put(attribute);
        Assert.assertEquals("value", att.get("key"));
    }

    @Test
    public void removeNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        att.remove("key");
        Assert.assertEquals("", att.get("key"));
    }

    @Test
    public void hasKeyNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        Assert.assertTrue(att.hasKey("key"));
    }

    @Test
    public void sizeNormalScenarioTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        att.put("key2", "value2");
        Assert.assertEquals(2, att.size());
    }

    @Test
    public void isEmptyNormalScenarioTest() {
        Attributes att = new Attributes();
        Assert.assertTrue(att.isEmpty());
    }

    @Test
    public void addAllNormalScenarioTest() {
        Attributes att1 = new Attributes();
        att1.put("key", "value");

        Attributes att2 = new Attributes();
        att2.put("key2", "value2");

        att1.addAll(att2);

        Assert.assertEquals(2, att1.size());
    }

    @Test
    public void equalsNormalScenarioTest() {
        Attributes att1 = new Attributes();
        att1.put("key", "value");

        Attributes att2 = new Attributes();
        att2.put("key", "value");

        Assert.assertTrue(att1.equals(att2));
    }

    @Test
    public void cloneNormalScenarioTest() {
        Attributes att1 = new Attributes();
        att1.put("key", "value");

        Attributes att2 = att1.clone();

        Assert.assertEquals(att1, att2);
    }

}