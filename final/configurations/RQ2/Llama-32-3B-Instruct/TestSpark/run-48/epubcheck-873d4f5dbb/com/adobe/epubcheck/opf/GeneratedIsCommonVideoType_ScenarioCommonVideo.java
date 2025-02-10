package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCommonVideoType_ScenarioCommonVideo {

    @Mock
    private ValidationContext context;

    @Test
    public void isCommonVideoType_ScenarioCommonVideo() {
        String type = "commonVideo";
        boolean result = OPFChecker30.isCommonVideoType(type);
        assertTrue(result);
    }

}