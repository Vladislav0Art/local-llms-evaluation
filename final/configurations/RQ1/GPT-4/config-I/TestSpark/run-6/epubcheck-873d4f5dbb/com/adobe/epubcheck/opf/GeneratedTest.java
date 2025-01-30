package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.api.MasterReport;
import com.adobe.epubcheck.messages.MessageId;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;
import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {


    @Mock
    ValidationContext context = Mockito.mock(ValidationContext.class);
    @Mock
    MasterReport report = Mockito.mock(MasterReport.class);
    @InjectMocks
    OPFChecker30 opfChecker30;

    @Test
    public void isAudioTypeTrueTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp3"));
    }

    @Test
    public void isAudioTypeFalseTest() {
        assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

    @Test
    public void isBlessedAudioTypeTrueTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

    @Test
    public void isBlessedAudioTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/mp3"));
    }

    @Test
    public void isVideoTypeTrueTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}