package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCommonVideoType_ReturnsTrue {

    @Mock
    private ValidationContext context;

    @Spy
    private OPFChecker30 opfChecker30;

    @InjectMocks
    private OPFChecker30 opfChecker30UnderTest;

    @Test
    public void isCommonVideoType_ReturnsTrue() {
        assertTrue(opfChecker30.isCommonVideoType("video"));
    }

}