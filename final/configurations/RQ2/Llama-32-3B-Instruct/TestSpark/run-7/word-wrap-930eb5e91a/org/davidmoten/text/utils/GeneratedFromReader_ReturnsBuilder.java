package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromReader_ReturnsBuilder {

    @Test
    public void fromReader_ReturnsBuilder() {
        assertEquals(WordWrap.from(reader).isPresent(), true);
    }

}