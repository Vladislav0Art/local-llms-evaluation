package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCreateEpubCheckWithInvalidProfile Test {

    @Test
    public void createEpubCheckWithInvalidProfile

    Test() {
        EpubCheckerFactory factory = new EpubCheckerFactory();
        String[] args = {"path", "invalidProfile"};
        EpubCheck instance = factory.createEpubCheck(args[0], args[1]);
        assertNull(instance);
    }

}