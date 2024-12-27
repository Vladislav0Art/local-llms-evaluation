package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCommonVideoTypeVideo {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void isCommonVideoTypeVideo() {
        assertTrue(OPFChecker30.isCommonVideoType("common-video"));
    }

}