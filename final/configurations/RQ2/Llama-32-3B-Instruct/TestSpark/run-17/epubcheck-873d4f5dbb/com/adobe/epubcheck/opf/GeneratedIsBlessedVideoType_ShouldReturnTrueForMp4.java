package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedVideoType_ShouldReturnTrueForMp4 {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void isBlessedVideoType_ShouldReturnTrueForMp4() {
        String type = "video/mp4";
        assertTrue(OPFChecker30.isBlessedVideoType(type));
    }

}