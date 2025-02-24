package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Attributes attributes;

    @Before
    public void beforeEach() {
        attributes = new Attributes();
    }

    @After
    public void afterEach() {
        attributes = null;
    }

    @Test
    public void testIndexOfKey() {
        attributes.add("key", "value");
        int result = attributes.indexOfKey("key");
        assertEquals(0, result);
    }

    @Test
    public void testCheckNotNullNull() {
        String result = Attributes.checkNotNull(null);
        assertEquals("", result);
    }

    @Test
    public void testCheckNotNullNoNull() {
        String result = Attributes.checkNotNull("value");
        assertEquals("value", result);
    }

}