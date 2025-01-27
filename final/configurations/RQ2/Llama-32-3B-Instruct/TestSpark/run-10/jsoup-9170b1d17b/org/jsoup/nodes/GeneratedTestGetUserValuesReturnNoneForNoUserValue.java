package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestGetUserValuesReturnNoneForNoUserValue {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testGetUserValuesReturnNoneForNoUserValue() {
        Attributes attributes = new Attributes();
        Object value = null;
        attributes.put("key", value);
        Object result = attributes.getUserData("key");
        assertNull(result);
    }

}