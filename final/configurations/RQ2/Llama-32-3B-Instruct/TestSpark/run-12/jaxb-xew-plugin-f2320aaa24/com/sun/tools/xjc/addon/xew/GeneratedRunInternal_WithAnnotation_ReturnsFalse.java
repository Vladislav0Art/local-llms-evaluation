package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedRunInternal_WithAnnotation_ReturnsFalse {

    @Test
    public void runInternal_WithAnnotation_ReturnsFalse() throws ClassNotFoundException, IOException {
        boolean result = XmlElementWrapperPlugin.runInternal(null);
        assertFalse(result);
    }

}