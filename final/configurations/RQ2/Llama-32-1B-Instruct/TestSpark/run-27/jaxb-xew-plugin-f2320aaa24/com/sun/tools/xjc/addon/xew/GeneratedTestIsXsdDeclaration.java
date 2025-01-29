package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestIsXsdDeclaration {

    @Test
    public void testIsXsdDeclaration() {
        JAnnotatable annot = new JAnnotatable();
        assertEquals(true, isXsdDeclaration(annot));
    }

}