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

public class GeneratedEqualsWithNonExistingKeyTest {

    @Test
    public void equalsWithNonExistingKeyTest() {
        Attributes attr1 = new Attributes();
        attr1.put("key1", "value1");

        Attributes attr2 = new Attributes();
        attr2.put("key2", "value1");

        assertFalse(attr1.equals(attr2));
    }

}