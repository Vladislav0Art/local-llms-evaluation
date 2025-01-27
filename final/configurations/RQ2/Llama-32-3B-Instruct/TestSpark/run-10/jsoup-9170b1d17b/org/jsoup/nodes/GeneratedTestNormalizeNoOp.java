package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoAnnotations;

public class GeneratedTestNormalizeNoOp {

    private MockitoAnnotations annotations = MockitoAnnotations.builder().build();

    @Test
    public void testNormalizeNoOp() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.normalize();
        // no-op
    }

}