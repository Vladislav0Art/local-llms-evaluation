package org.jsoup.nodes;

public class GeneratedTest {

    private String[] keys;
    private Object[] vals;

    public static Attributes createAttributes(String[] keys, Object[] vals) {
        return new Attributes(keys, vals);
    }

    public String get(int index) {
        return (String) vals[index];
    }
}

public class ParseSettings {
    public boolean normalize;

    public void setNormalize(boolean normalize) {
        this.normalize = normalize;
    }
}

public class Main {
    public static void main(String[] args) {
        Attributes attributes = Attributes.createAttributes(new String[]{"key1", "key2"}, new Object[]{"value1", "value2"});
        System.out.println(attributes.get(0));
    }
}

public class TestAttributes {

    @Test
    public void testGet() {
        Attributes attributes = Attributes.createAttributes(new String[]{"key1", "key2"}, new Object[]{"value1", "value2"});
        assertEquals("value1", (String) attributes.get(0));
        assertEquals("value2", (String) attributes.get(1));
    }

    @Test
    public void testNormalize() {
        ParseSettings settings = new ParseSettings();
        settings.setNormalize(true);
        Attributes attributes = Attributes.createAttributes(new String[]{"Key1", "Key2"}, new Object[]{"Value1", "Value2"});
        assertEquals("Key1", ((String[]) attributes.keys)[0]);
        assertEquals("Key2", ((String[]) attributes.keys)[1]);
    }

    @Test
    public void testDeduplicate() {
        ParseSettings settings = new ParseSettings(true);
        Attributes attributes = Attributes.createAttributes(new String[]{"key1", "key2", "key3"}, new Object[]{"value1", "value2", "value3"});
        assertEquals(0, ((String[]) attributes.keys).length - 2);
    }

    @Test
    public void testEquals() {
        Attributes attributes1 = Attributes.createAttributes(new String[]{"key1", "key2"}, new Object[]{"value1", "value2"});
        Attributes attributes2 = Attributes.createAttributes(new String[]{"Key1", "Key2"}, new Object[]{"Value1", "Value2"});
        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    public void testHashCode() {
        Attributes attributes = Attributes.createAttributes(new String[]{"key1", "key2"}, new Object[]{"value1", "value2"});
        assertEquals(0, attributes.hashCode());
    }

}