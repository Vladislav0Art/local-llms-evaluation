package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Set;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @RunWith(MockitoJUnitRunner.class)
    public class OPFChecker30_test {

        @Test
        public void checkPackage_return_false() {
            boolean result = new OPFChecker30(new ValidationContext()).checkPackage();
            assertTrue(result);
        }

        @Test
        public void checkContent_return_true() {
            boolean result = new OPFChecker30(new ValidationContext()).checkContent();
            assertTrue(result);
        }

        @Test
        public void checkItem_return_true() {
            boolean result = new OPFChecker30(new ValidationContext()).checkItem(Mockito.mock(OPFItem.class), Mockito.mock(OPFHandler.class));
            assertTrue(result);
        }

        @Test
        public void checkSpineItem_return_false() {
            boolean result = new OPFChecker30(new ValidationContext()).checkSpineItem(Mockito.mock(OPFItem.class), Mockito.mock(OPFHandler.class));
            assertTrue(result);
        }

        @Test
        public void isAudioType_return_true() {
            String type = "audio/mp3";
            boolean result = OPFChecker30.isAudioType(type);
            assertTrue(result);
        }

        @Test
        public void isBlessedAudioType_return_true() {
            String type = "blessed/audio/mp3";
            boolean result = OPFChecker30.isBlessedAudioType(type);
            assertTrue(result);
        }

        @Test
        public void isVideoType_return_false() {
            String type = "video/mp4";
            boolean result = OPFChecker30.isVideoType(type);
            assertFalse(result);
        }

        @Test
        public void isFontType_return_true() {
            String type = "text/x-ttf";
            boolean result = OPFChecker30.isFontType(type);
            assertTrue(result);
        }

        @Test
        public void getPreferredMediaType_return_string() {
            String type = "video/mp4";
            String path = "/path/to/video.mp4";
            String preferredMediaType = OPFChecker30.getPreferredMediaType(type, path);
            assertEquals("application/x-mpegURL", preferredMediaType);
        }
    }

    @Test
    public void initHandler_return_true() {
        boolean result = new OPFChecker30(new ValidationContext()).initHandler();
        assertTrue(result);
    }

    @Test
    public void checkItemAfterResourceValidation_return_false() {
        boolean result = new OPFChecker30(new ValidationContext()).checkItemAfterResourceValidation(Mockito.mock(OPFItem.class));
        assertTrue(result);
    }

}