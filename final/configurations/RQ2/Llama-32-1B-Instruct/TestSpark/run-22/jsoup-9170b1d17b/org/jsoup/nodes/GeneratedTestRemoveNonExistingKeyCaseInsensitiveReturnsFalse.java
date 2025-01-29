package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestRemoveNonExistingKeyCaseInsensitiveReturnsFalse {

    @Test
    public void testRemoveNonExistingKeyCaseInsensitiveReturnsFalse() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.removeIgnoreCase("non-existing-key"));
        assertTrue(attrs.remove("non-existent-key"));
    }

}