package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestPutUserData {

    @Test
    public void testPutUserData() {
        Attributes attrs = new Attributes();
        attrs.putUserData("test", "value");
        assertEquals("value", attrs.getUserData("test").toString());
        assertNull(attrs.getUserData("test"));
    }

}