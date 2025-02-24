package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class GeneratedCheckNotNullTest {

    @Test
    public void checkNotNullTest() {
        assertNull(Attributes.checkNotNull(null));
        assertEquals("value", Attributes.checkNotNull("value"));
    }

}