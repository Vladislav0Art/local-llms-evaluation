package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromClasspath_ReturnsBuilder {

    @Test
    public void fromClasspath_ReturnsBuilder() {
        assertEquals(WordWrap.fromClasspath("resource", StandardCharsets.UTF_8).isPresent(), true);
    }

}