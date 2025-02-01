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

public class GeneratedGetExistingKeyTest {

    @Test
    public void getExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        String value = attributes.get("key1");

        assertEquals("value1", value);
    }

}