package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestDeduplicate {

    @Test
    public void testDeduplicate() {
        Attributes attributes = new Attributes();
        attributes.set("key1", "value1");
        attributes.set("key2", "value2");

        int dedupes = attributes.deduplicate(ParseSettings.PRESERVE_ATTRIBUTE_CASE);

        Assertions.assertEquals(1, dedupes);
    }

}