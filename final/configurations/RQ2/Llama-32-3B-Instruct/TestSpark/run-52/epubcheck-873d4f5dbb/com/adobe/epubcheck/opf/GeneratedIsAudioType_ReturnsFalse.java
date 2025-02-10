package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioType_ReturnsFalse {

    @Mock
    private ValidationContext context;

    @Spy
    private OPFChecker30 opfChecker30;

    @InjectMocks
    private OPFChecker30 opfChecker30UnderTest;

    @Test
    public void isAudioType_ReturnsFalse() {
        assertFalse(opfChecker30.isAudioType("other"));
    }

}