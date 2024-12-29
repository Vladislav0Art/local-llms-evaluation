package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testGetStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get("key"));
    }

    @Test
    public void testGetStringIgnoreCaseWithoutNotNull() {
        Attributes attributes = new Attributes();
        assertEquals("<key>", attributes.getIgnoreCase("key"));
    }

    @Test
    public void testGetUserDataWithoutNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(null, attributes.getUserData("key"));
    }

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        attributes.put("user_data", "value");
        assertEquals("value", attributes.getUserData("user_data"));
    }

    @Test
    public void testAddStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testAddString() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testPutStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testPutString() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testAddAttributesWithoutNotNull() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

    @Test
    public void testAddAttributeWithoutNotNull() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void testRemoveString() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        assertEquals("", attributes.get("key"));
    }

    @Test
    public void testRemoveAllAttributes() {
        Attributes attributes = new Attributes();
        attributes.removeAll(new Attributes());
        assertEquals(0, attributes.size());
    }

    @Test
    public void testRemoveAttribute() {
        Attributes attributes = new Attributes();
        attributes.remove("key");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testHasKeyStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(false, attributes.containsKey("key"));
    }

    @Test
    public void testHasKeyIgnoreCaseStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(false, attributes.containsKeyIgnoreCase("key"));
    }

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals(true, attributes.containsKey("key"));
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        assertEquals(false, attributes.containsKeyIgnoreCase("KEY"));
    }

    @Test
    public void testHasDeclaredValueForKeyStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(false, attributes.containsKey("key"));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCaseStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(true, attributes.containsKeyIgnoreCase("KEY"));
    }

    @Test
    public void testHasKeyDECLAREDVALUE_FOR_KEY_STRING_WITHOUT_NOT_NULL() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals(false, attributes.containsKey("declare_value_key"));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCaseStringWithoutNotNull() {
        Attributes attributes = new Attributes();
        assertEquals(true, attributes.containsKeyIgnoreCase("KEY"));
    }

    @Test
    public void testHasDeclaredValueForUserDataKey() {
        Attributes attributes = new Attributes();
        attributes.putUserData("user_data", "value");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testRemoveAllAttributesWithUserData() {
        Attributes attributes = new Attributes();
        attributes.removeUserData("user_data");
        assertEquals(0, attributes.size());
    }

    @Test
    public void testRemoveAttributeUserData() {
        Attributes attributes = new Attributes();
        attributes.removeUserData("user_data");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testHasDeclaredValueForUserDataKey() {
        Attributes attributes = new Attributes();
        attributes.putUserData("user_data", "value");
        assertEquals(1, attributes.size());
    }

}