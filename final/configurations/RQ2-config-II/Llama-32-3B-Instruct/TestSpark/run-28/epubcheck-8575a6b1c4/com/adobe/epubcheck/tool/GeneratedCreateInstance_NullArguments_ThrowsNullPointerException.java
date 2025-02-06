package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedCreateInstance_NullArguments_ThrowsNullPointerException {

    @Test
    public void createInstance_NullArguments_ThrowsNullPointerException() {
        EpubCheckerFactory factory = new EpubCheckerFactory();
        assertThrows(NullPointerException.class, () -> factory.createInstance(null));
    }
}

}