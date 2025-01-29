package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGenerableToString {

    @Test
    public void testGenerableToString() {
        JAnnotatable annot = new JAnnotatable();
        assertEquals("<xs:element name='test'>", generableToString(annot));
    }

}