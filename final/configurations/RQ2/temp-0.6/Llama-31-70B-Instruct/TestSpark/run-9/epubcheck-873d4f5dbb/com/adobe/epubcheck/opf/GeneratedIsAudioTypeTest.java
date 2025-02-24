package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedIsAudioTypeTest {

    private OPFChecker30 opfChecker30;

    @Before
    public void setUp() {
        opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
    }

    @Test
    public void isAudioTypeTest() {
        boolean result = OPFChecker30.isAudioType("audio/mpeg");
        assertTrue(result);
    }

}