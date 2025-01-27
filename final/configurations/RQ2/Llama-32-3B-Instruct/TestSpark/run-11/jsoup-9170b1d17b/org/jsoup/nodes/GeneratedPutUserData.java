package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.internal.StringUtil;

public class GeneratedPutUserData {

    @Test
    public void putUserData() {
        Attributes attributes = new Attributes();
        Object value = mock(Object.class);
        when(attributes.putUserData("test", value)).thenReturn(attributes);
        assertEquals(value, attributes.putUserData("test"));
    }

}