package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromClasspathUtf8_ReturnsBuilder {

    @Test
    public void fromClasspathUtf8_ReturnsBuilder() {
        assertEquals(WordWrap.fromClasspathUtf8("resource").isPresent(), true);
    }

}