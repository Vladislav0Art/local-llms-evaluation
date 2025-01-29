package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPutValueIgnoreCaseNonExistingKeyCaseInsensitiveReturnsFalse {

    @Test
    public void testPutValueIgnoreCaseNonExistingKeyCaseInsensitiveReturnsFalse() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.putIgnoreCase("non-existing-key", "value"));
        assertFalse(attrs.getUserData("non-existent-key"));
    }

}