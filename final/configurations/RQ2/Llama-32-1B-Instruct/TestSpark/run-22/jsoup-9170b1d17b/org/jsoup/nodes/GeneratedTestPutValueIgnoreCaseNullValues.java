package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPutValueIgnoreCaseNullValues {

    @Test
    public void testPutValueIgnoreCaseNullValues() {
        Attributes attrs = new Attributes();
        assertNotNull(attrs.putIgnoreCase(null, "value"));
        assertFalse(attrs.getUserData(null));
    }

}