package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckNotNullTest {

    @Test
    public void checkNotNullTest() {
        assertEquals("", Attributes.checkNotNull(null));
        assertEquals("", Attributes.checkNotNull(""));
        assertEquals("testValue", Attributes.checkNotNull("testValue"));
    }

}