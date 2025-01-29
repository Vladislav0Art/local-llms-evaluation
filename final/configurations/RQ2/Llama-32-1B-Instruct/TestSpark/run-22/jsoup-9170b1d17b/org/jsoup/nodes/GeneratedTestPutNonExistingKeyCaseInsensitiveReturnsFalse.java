package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPutNonExistingKeyCaseInsensitiveReturnsFalse {

    @Test
    public void testPutNonExistingKeyCaseInsensitiveReturnsFalse() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.putIgnoreCase("non-existing-key", "value"));
        assertFalse(attrs.hasKeyIgnoreCase("non-existent-key"));
        assertNull(attrs.getUserData("non-existent-key"));
    }

}