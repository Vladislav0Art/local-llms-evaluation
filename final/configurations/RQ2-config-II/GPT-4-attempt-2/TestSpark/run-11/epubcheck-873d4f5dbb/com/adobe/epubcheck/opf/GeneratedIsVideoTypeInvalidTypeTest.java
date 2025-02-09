package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsVideoTypeInvalidTypeTest {

    @Test
    public void isVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isVideoType("invalid"));
    }

}