package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void get[
    StringKey]

    ReturnsValue() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void getUserData[
    StringKey]

    ReturnsNull() {
        Attributes attributes = new Attributes();
        Object userData = attributes.getUserData("key");
        assertTrue(userData == null);
    }

    @Test
    public void checkNotNull[
    NotNullValue]

    ReturnsNotNullableString() {
        assertEquals("not nullable", org.jsoup.helper.Validate.checkNotNull(null));
    }

    @Test
    public void getIgnoreCase[
    StringKey]

    ReturnsLowerCaseValue() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void hasKey[
    StringKey]

    ReturnsTrue() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void hasDeclaredValueForKey[
    StringKey]

    ReturnsFalse() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasDeclaredValueForKey("key"));
    }

    @Test
    public void put[
    BooleanValue]

    SetsAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void remove[
    StringKey]

    RemovesKey() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void size[
    Attributes]

    ReturnsSize() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

    @Test
    public void isEmpty[
    Attributes]

    ReturnsTrue() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void addAll[
    IncomingAttributes]

    AddsKeysAndValues() {
        Attributes incoming = new Attributes();
        incoming.put("key", "value");
        Attributes attributes = new Attributes();
        attributes.addAll(incoming);
        assertEquals(1, attributes.size());
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void normalize[
    Attributes]

    RemovesNullValues() {
        Attributes attributes = new Attributes();
        attributes.put("key", null);
        attributes.normalize();
        assertFalse(attributes.hasKey("key"));
    }

}