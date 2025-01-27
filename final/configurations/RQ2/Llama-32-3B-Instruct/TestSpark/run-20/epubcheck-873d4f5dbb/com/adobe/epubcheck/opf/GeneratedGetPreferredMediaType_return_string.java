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
public class GeneratedGetPreferredMediaType_return_string {

    @RunWith(MockitoJUnitRunner.class)
    public class OPFChecker30_test {

        @Test
        public void getPreferredMediaType_return_string() {
            String type = "video/mp4";
            String path = "/path/to/video.mp4";
            String preferredMediaType = OPFChecker30.getPreferredMediaType(type, path);
            assertEquals("application/x-mpegURL", preferredMediaType);
        }
    }

}