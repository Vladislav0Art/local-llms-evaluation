package org.jsoup.helper;

public class GeneratedTest {

    private String key;
    private String value;

    public PublicConnectionKeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class TestPublicConnectionKeyVal {

    @Test
    public void testGetKey() {
        PublicConnectionKeyVal connectionKeyVal = new PublicConnectionKeyVal("key1", "value1");
        assertEquals("key1", connectionKeyVal.getKey());
    }

    @Test
    public void testGetValue() {
        PublicConnectionKeyVal connectionKeyVal = new PublicConnectionKeyVal("key2", "value2");
        assertEquals("value2", connectionKeyVal.getValue());
    }

    @Test
    public void testGetBothKeyAndValue() {
        PublicConnectionKeyVal connectionKeyVal = new PublicConnectionKeyVal("key3", "value3");
        assertEquals("key3", connectionKeyVal.getKey());
        assertEquals("value3", connectionKeyVal.getValue());
    }

}