package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedClone_CreatesNewAttributesClone {

    @Test
    public void clone_CreatesNewAttributesClone() {
        Attributes original = new Attributes();
        original.put("key", "value");
        Attributes cloned = original.clone();
        assertNotSame(original, cloned);
        assertEquals(1, cloned.size());
        assertTrue(cloned.hasKey("key"));
        assertEquals("value", cloned.get("key"));
    }

}