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

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.put("Key1", "value1");

        String value = attributes.getIgnoreCase("key1");

        assertEquals("value1", value);
    }

}