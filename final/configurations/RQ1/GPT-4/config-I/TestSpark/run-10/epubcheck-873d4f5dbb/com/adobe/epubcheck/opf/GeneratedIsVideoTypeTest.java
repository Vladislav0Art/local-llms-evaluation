package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        String videoType = "video/mp4";
        assert (OPFChecker30.isVideoType(videoType));
    }

}