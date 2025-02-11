package org.jsoup.nodes;

public class GeneratedTestGet {

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

}