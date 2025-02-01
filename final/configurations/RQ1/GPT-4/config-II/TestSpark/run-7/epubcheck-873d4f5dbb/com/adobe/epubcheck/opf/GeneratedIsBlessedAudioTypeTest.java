package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.util.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        String testInput = "audio/mpeg";
        boolean expectedResult = true;

        boolean actualResult = OPFChecker30.isBlessedAudioType(testInput);

        assert actualResult == expectedResult;
    }

}