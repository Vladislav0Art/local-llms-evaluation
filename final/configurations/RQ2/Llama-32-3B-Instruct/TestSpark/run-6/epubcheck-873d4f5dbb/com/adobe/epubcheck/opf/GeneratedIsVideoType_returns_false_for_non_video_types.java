package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsVideoType_returns_false_for_non_video_types {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFChecker opfChecker;

    public void initHandler() {
        opfChecker.initHandler();
    }

    @Test
    public void isVideoType_returns_false_for_non_video_types() {
        when(context.getMediaOverlaysVocab()).thenReturn(new MediaOverlaysVocab());
        assertFalse(OPFChecker30.isVideoType("text"));
    }

}