package org.jsoup.nodes;

import org.junit4.JUnit4ClassRunner;
import org.junit.Test;

public class GeneratedTest {

    @Override
    protected Object createSuite() throws Exception {
        return super.createSuite();
    }

    public void testGetWhenNotPresent() {
        // Arrange and Act
        Attributes attributes = new Attributes();
        String key = "test";
        String value = "value";

        String result = attributes.get(key);
        assertNull(result);
    }

    public void testAddAndGet() {
        // Arrange and Act
        Attributes attributes = new Attributes();
        String key = "test";
        String value = "value";

        attributes.add(key, value);

        assertEquals(1, attributes.size());
        assertEquals(value, attributes.get(key));
    }

    public void testGetUserData() {
        // Arrange and Act
        Attributes attributes = new Attributes();
        String key = "test";
        Object value = "value";

        attributes.add(key, value);

        Object result = attributes.getUserData(key);
        assertEquals(value, result);
    }

}