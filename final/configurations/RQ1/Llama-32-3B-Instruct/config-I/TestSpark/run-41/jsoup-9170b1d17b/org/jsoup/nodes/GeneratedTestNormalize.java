package org.jsoup.nodes;

public class GeneratedTestNormalize {

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
    public void testNormalize() {
        ParseSettings settings = new ParseSettings();
        settings.setNormalize(true);
        Attributes attributes = Attributes.createAttributes(new String[]{"Key1", "Key2"}, new Object[]{"Value1", "Value2"});
        assertEquals("Key1", ((String[]) attributes.keys)[0]);
        assertEquals("Key2", ((String[]) attributes.keys)[1]);
    }

}