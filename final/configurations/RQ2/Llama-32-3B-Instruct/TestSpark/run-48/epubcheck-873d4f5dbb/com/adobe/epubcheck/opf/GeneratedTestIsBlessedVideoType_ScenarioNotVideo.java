package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestIsBlessedVideoType_ScenarioNotVideo {

    @Mock
    private ValidationContext context;

    public static boolean checkPackage() {
        // implementation here
        return true;
    }

    public static boolean checkContent() {
        // implementation here
        return false;
    }

    public static boolean checkItem(OPFItem item, OPFHandler opfHandler) {
        // implementation here
        return true;
    }

    @Test
    public void testIsBlessedVideoType_ScenarioNotVideo() {
        String type = "not video";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertFalse(result);
    }

}