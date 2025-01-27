package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTestCheckNotNull {

    @Test
    public void testCheckNotNull() {
        assertEquals("test", Attributes.checkNotNull("test"));
        assertNull(Attributes.checkNotNull(null));
    }

}