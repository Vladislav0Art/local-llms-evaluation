package org.jsoup.nodes;

public class GeneratedTestAttributes {

    private String[] keys;
    private Object[] vals;

    public Attributes(String[] keys, Object[] vals) {
        this.keys = keys;
        this.vals = vals;
    }

    // getters and setters
}

public class Main {
    public static void main(String[] args) {
        Attributes attributes = new Attributes(new String[]{"key1", "key2"}, new Object[]{"value1", "value2"});
        System.out.println(attributes.get(0));
    }
}

public class TestAttributes {

    @Test
    public void testAttributes() {
        Attributes attributes = new Attributes(new String[]{"key1", "key2"}, new Object[]{"value1", "value2"});
        assertEquals("value1", attributes.get(0));
        assertEquals("value2", attributes.get(1));
    }

}