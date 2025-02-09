package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedIsCommonVideoTypeNonCommonVideoTypeTest {

    @Test
    public void isCommonVideoTypeNonCommonVideoTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/avi"));
    }

}