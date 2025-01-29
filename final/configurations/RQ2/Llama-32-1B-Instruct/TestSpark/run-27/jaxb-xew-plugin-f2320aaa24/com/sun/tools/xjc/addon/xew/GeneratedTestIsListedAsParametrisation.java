package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestIsListedAsParametrisation {

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable annot = new JAnnotatable();
        assertEquals(false, isListedAsParametrisation(annot));
    }

}