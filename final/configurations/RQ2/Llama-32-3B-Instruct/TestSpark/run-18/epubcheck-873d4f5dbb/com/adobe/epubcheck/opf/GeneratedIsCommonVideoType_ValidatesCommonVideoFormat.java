package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCommonVideoType_ValidatesCommonVideoFormat {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void isCommonVideoType_ValidatesCommonVideoFormat() {
        String type = "video/x-mpeg-4";
        assertTrue(OPFChecker30.isCommonVideoType(type));
    }

}