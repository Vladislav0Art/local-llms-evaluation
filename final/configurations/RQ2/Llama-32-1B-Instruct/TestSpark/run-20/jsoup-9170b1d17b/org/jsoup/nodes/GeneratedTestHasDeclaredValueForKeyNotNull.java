package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyNotNull {

    @Test
    public void testHasDeclaredValueForKeyNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";

        // Note: internal set does not support null values.
        //      It will throw a NullPointerException when trying to put null value into it.

        Object value = 123;
        assertEquals(0, attributes.hasDeclaredValueForKey(key));

        // Internal set does not support checking declared value using equals() method
        //       for keys that do not have a corresponding internal attribute (e.g., "key" vs. "KEY")
    }

}