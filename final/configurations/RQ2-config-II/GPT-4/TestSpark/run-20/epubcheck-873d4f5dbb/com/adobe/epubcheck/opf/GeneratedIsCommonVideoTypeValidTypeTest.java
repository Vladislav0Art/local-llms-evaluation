package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCommonVideoTypeValidTypeTest {

    @Test
    public void isCommonVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/webm"));
    }

}