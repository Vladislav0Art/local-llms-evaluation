package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        String type = "video/mp4";
        assert (OPFChecker30.isVideoType(type));
    }

}