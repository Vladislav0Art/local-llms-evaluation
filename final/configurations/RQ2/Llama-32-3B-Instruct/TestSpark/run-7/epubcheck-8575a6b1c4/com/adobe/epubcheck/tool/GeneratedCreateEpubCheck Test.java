package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCreateEpubCheck Test {

    @Test
    public void createEpubCheck

    Test() {
        EpubCheckerFactory factory = new EpubCheckerFactory();
        EpubCheck instance = factory.createEpubCheck("path", "profile");
        assertNotNull(instance);
    }

}