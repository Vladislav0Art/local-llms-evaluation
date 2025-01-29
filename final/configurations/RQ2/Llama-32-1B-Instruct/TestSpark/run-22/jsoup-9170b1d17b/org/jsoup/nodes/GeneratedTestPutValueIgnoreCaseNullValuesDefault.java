package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPutValueIgnoreCaseNullValuesDefault {

    @Test
    public void testPutValueIgnoreCaseNullValuesDefault() {
        Attributes attrs = new Attributes();
        assertNull(attrs.putIgnoreCase(null, "value"));
        assertEquals("value", attrs.get("test").toString());
        assertNull(attrs.getUserData("test"));
    }

}