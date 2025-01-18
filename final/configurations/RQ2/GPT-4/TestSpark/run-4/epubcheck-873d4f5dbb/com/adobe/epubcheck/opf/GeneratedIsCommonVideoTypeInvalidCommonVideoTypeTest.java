package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsCommonVideoTypeInvalidCommonVideoTypeTest {

    @Test
    public void isCommonVideoTypeInvalidCommonVideoTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/pdf"));
    }

}