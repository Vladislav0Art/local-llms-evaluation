package org.davidmoten.text.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GeneratedTestLeftTrim {

    @Test
    public void testLeftTrim() {
        WordWrap wordWrap = new WordWrap();
        assertEquals("  text ", wordWrap.leftTrim("  text "));
    }

}