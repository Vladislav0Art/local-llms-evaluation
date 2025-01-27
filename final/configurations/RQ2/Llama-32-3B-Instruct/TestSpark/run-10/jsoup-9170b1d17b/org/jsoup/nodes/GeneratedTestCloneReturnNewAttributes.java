package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestCloneReturnNewAttributes {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testCloneReturnNewAttributes() {
        Attributes originalAttributes = new Attributes();
        Attributes clonedAttributes = originalAttributes.clone();
        assertNotEquals(originalAttributes, clonedAttributes);
    }

}