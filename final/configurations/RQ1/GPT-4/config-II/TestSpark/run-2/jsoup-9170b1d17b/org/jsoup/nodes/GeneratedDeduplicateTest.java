package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value1");
        attributes.put("key", "value2");

        attributes.deduplicate(new ParseSettings(true, true));

        assertTrue(attributes.size() == 1);
    }

}