package org.jsoup.safety;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetEnforcedAttributes_NoEnforcement {

    @Test
    public void testGetEnforcedAttributes_NoEnforcement() {
        // Arrange
        Map<String, AttributeValue> enforcedValues = new HashMap<>();

        // Act
        Attributes attrs = getEnforcedAttributes("testAttr");

        // Assert
        assertEquals(0, attrs.size());
    }
}

class Test {

    private static class Utils {
        public static Map<String, AttributeValue> getEnforcedAttributes(String tagName) {
            return testGetEnforcedAttributes(tagName);
        }

        private static Map<String, AttributeValue> testGetEnforcedAttributes(String tagName) {
            // Arrange
            Map<String, AttributeValue> keyVals = new HashMap<>();

            keyVals.put("testKey", new AttributeValue("#"));
            keyVals.put("key1", new AttributeValue("value1"));

            return testGetEnforcedAttributes(tagName, keyVals);
        }

        private static Map<String, AttributeValue> testGetEnforcedAttributes(String tagName, Map<String, AttributeValue> keyVals) {
            // Act
            Attributes attrs = getEnforcedAttributes(tagName);

            // Assert
            Map<AttributeKey, AttributeValue> enforcedSet = new HashMap<>();
            for (Map.Entry<String, AttributeValue> entry : keyVals.entrySet()) {
                enforcedSet.put(new AttributeKey(entry.getKey()), entry.getValue());
            }
            return enforcedSet;
        }

        private static Attributes getEnforcedAttributes(String tagName) {
            // Act
            Map<AttributeKey, AttributeValue> keyVals = testGetEnforcedAttributes(tagName);
            Attributes attrs = new Attributes();
            for (Map.Entry<String, AttributeValue> entry : keyVals.entrySet()) {
                attrs.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return attrs;
        }

        private static void assertIsTrue(boolean condition) {
            if (!condition) {
                fail("Expected true but got false");
            }
        }

        private static void assertIsFalse(boolean condition) {
            if (condition) {
                fail("Expected false but got true");
            }
        }

        private static void assertEquals(int expected, int actual) {
            if (actual != expected) {
                fail("Expected " + expected + " but got " + actual);
            }
        }

        private static void assertIsTrue(boolean condition) {
            assertTrue(condition);
        }

        private static void assertIsFalse(boolean condition) {
            assertFalse(condition);
        }

        private static void assertEquals(int expected, int actual) {
            assertEquals(expected, actual);
        }
    }

    public static class Attributes extends HashMap<String, String> {

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;

            Attributes other = (Attributes) obj;

            int size = size();

            for (Map.Entry<String, String> entry : entries()) {

                if (!entry.getValue().equals(other.get(entry.getKey())))
                    return false;
            }

            return true;
        }

        public static void main(String[] args) {
            Test test = new Test();
            System.out.println(testEquals(new Attributes(), new Attributes()));
        }

        private static boolean testGetEnforcedAttributes(String tagName, Map<String, AttributeValue> keyVals) {
            for (Map.Entry<String, AttributeValue> entry : keyVals.entrySet()) {

                Attributes attrs1 = new Attributes();
                if (!testGetEnforcedAttributes(tagName, entry.getValue()))
                    return false;
                attrs1.put(entry.getKey().toString(), testEquals(entry.getValue().getValue(), entry.getValue()));

                Attributes attrs2 = new Attributes();
                for (Map.Entry<String, AttributeValue> entry2 : keyVals.entrySet()) {
                    attrs2.put(entry2.getKey().toString(), entry2.getValue());
                }
                if (!testEquals(attrs1, attrs2))
                    return false;
            }

            return true;
        }

        private static String testEquals(String expected, String actual) {
            return expected.equals(actual);
        }
    }

}