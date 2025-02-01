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

public class GeneratedAddValidKeyTest {

    @Test
    public void addValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");

        int addedKeyIndex = attributes.indexOfKey("key1");
        String addedValue = (String) attributes.vals[addedKeyIndex];

        assertEquals("value1", addedValue);
    }

}