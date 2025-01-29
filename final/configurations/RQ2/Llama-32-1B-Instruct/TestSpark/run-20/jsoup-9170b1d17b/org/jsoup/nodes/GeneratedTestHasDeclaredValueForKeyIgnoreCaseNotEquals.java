package org.jsoup.nodes;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCaseNotEquals {

    @Test
    public void testHasDeclaredValueForKeyIgnoreCaseNotEquals() {
        Attributes attributes = new Attributes();
        String key = "key";

        Object value = 123;

        assertEquals(0, attributes.hasDeclaredValueForKey(String.valueOf(key)));

        // Internal set does not support checking declared value using equals() method
        //       for keys that do not have a corresponding internal attribute (e.g., "key" vs. "KEY")
    }

}