package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetNonExistingKeyReturnsDefault {

    @Test
    public void testGetNonExistingKeyReturnsDefault() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.get("non-existing-key"));
        assertNull(attrs.get("not-found-key"));
    }

}