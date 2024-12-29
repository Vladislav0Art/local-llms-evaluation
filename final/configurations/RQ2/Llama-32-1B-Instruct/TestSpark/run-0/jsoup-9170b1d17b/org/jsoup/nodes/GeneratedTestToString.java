package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = 123;
        attributes.put(key, value);
        assertEquals("<AttrUtils>Key=123</AttrUtils>", attributes.toString());
    }

    private static class TestAttribute {

        private final String key;
        private final String value;

        public TestAttribute(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

}