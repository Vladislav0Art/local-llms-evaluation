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

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attr1 = new Attributes();
        attr1.put("key", "value");

        Attributes attr2 = new Attributes();
        attr2.put("key", "value");

        assertTrue(attr1.equals(attr2));
    }

}