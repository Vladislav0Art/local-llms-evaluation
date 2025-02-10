package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestIsVideoType_ScenarioVideo {

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
    public void testIsVideoType_ScenarioVideo() {
        String type = "video";
        boolean result = OPFChecker30.isVideoType(type);
        assertTrue(result);
    }

}