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

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key1", "value1");
        attributes.put("KEY2", "value2");

        attributes.normalize();

        assertTrue(attributes.hasKey("key1"));
        assertTrue(attributes.hasKey("key2"));
    }

}