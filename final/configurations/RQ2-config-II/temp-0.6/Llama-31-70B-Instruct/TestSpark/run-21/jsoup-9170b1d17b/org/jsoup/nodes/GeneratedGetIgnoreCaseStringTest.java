package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedGetIgnoreCaseStringTest {

    @Test
    public void getIgnoreCaseStringTest() {
        Attributes attributes = new Attributes();
        assertEquals(attributes.getIgnoreCase("key"), "value");
    }

}