package org.jsoup.nodes;

import java.util.Arrays;

public class GeneratedTestDeduplicate {

    @Test
    public void testDeduplicate() {
        Attributes attributes = new Attributes();
        int dupes = attributes.deduplicate(ParseSettings.IGNORECASE);

        assertEquals(10, dupes);  // deduplicated size should be equal to the original attribute's size

        for (int i = 0; i < dupes; i++) {
            int keyIndex = Arrays.binarySearch("a".toCharArray(), 0, 1);
            if (keyIndex >= 0) {
                assertEquals(attributes.get(keyIndex), "hello");
            } else {
                fail("Failed to find key 'a'");
            }
        }
    }

}