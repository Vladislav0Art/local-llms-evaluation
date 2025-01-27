package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromUtf8Stream_ReturnsBuilder {

    @Test
    public void fromUtf8Stream_ReturnsBuilder() {
        assertEquals(WordWrap.fromUtf8(new FileInputStream("file")).isPresent(), true);
    }

}