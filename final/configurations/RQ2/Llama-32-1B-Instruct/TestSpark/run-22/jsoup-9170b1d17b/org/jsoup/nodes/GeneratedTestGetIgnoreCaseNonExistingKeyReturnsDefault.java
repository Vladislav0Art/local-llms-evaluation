package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetIgnoreCaseNonExistingKeyReturnsDefault {

    @Test
    public void testGetIgnoreCaseNonExistingKeyReturnsDefault() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.getIgnoreCase("non-existing-key"));
        assertNull(attrs.getUserData("non-existing-key"));
    }

}