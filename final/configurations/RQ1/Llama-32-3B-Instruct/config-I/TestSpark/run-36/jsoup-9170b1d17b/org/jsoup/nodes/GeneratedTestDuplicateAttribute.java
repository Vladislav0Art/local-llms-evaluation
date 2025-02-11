package org.jsoup.nodes;

public class GeneratedTestDuplicateAttribute {

    private String[] keys;
    private Object[] vals;

    // getters and setters

    public void put(String key, String value) {
        int index = indexOfKey(key);
        if (index == NotFound) {
            addKeyAndValue(key, value);
        } else {
            vals[index] = value;
        }
    }

    public String get(String key) {
        int index = indexOfKey(key);
        return (index != NotFound ? (String) vals[index] : null);
    }

    private static final int NotFound = -1;

    private int indexOfKey(String key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return NotFound;
    }

    public void addKeyAndValue(String key, String value) {
        String[] newKeys = new String[keys.length + 1];
        Object[] newValue = new Object[vals.length + 1];

        System.arraycopy(keys, 0, newKeys, 0, keys.length);
        System.arraycopy(vals, 0, newValue, 0, vals.length);

        newKeys[keys.length] = key;
        newValue[newValue.length - 1] = value;

        keys = newKeys;
        vals = newValue;
    }

    public int size() {
        return keys.length;
    }
}

public class AttributesTest {

    @Test
    public void testDuplicateAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key1", "new_value1");
        String result1 = attributes.get("key1");
        String result2 = attributes.get("key1");
        assertThat(result1, assertEquals("value1"));
        assertThat(result2, assertEquals("new_value1"));
    }

}