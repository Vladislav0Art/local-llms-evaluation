package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCommonVideoTypeInvalidTypeTest {

    @Test
    public void isCommonVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("invalid/type"));
    }

}