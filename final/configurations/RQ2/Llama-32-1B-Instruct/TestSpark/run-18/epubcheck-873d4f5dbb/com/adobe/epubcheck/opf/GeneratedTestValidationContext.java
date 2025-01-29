package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestValidationContext {

    @Test
    public void testValidationContext() {
        ValidationContext context = new ValidationContext();
        assertEquals(1, context.getNamespace().size());
        assertEquals("OPF", context.getExtensionName());
        assertTrue(context.isAudioType("audio"));
        assertTrue(context.isBlessedAudioType("audio"));
        assertTrue(context.isVideoType("video"));
        assertTrue(context.isBlessedVideoType("video"));
    }

}