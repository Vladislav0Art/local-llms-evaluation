package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestIsHiddenClass {

    @Test
    public void testIsHiddenClass() {
        JAnnotatable annot = new JAnnotatable();
        assertTrue(isHiddenClass(annot));
    }

}