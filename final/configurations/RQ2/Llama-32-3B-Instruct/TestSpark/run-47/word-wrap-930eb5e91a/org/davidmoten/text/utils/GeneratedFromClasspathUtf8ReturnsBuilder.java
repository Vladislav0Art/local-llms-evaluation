package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedFromClasspathUtf8ReturnsBuilder {

    @Test
    public void fromClasspathUtf8ReturnsBuilder() {
        String resource = "resource";
        assertEquals(WordWrap.Builder.class, WordWrap.fromClasspathUtf8(resource).getClass());
    }

}