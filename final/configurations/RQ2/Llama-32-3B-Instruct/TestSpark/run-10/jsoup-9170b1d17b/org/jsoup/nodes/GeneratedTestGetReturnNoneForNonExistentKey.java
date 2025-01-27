package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestGetReturnNoneForNonExistentKey {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testGetReturnNoneForNonExistentKey() {
        Attributes attributes = new Attributes();
        String result = attributes.get("non-existent-key");
        assertNull(result);
    }

}