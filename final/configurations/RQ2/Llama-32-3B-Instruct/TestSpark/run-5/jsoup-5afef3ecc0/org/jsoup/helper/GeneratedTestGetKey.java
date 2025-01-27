package org.jsoup.helper;

public class GeneratedTestGetKey {

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

}