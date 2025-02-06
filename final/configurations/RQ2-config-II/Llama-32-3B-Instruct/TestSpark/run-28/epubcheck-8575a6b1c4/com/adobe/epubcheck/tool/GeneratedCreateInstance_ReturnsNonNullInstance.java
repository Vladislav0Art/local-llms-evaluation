package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedCreateInstance_ReturnsNonNullInstance {

    @Test
    public void createInstance_ReturnsNonNullInstance() {
        EpubCheckerFactory factory = new EpubCheckerFactory();
        assertNotNull(factory.createInstance());
    }

}