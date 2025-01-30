package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
    }

    @Test
    public void checkPackageTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkPackage();
    }

    @Test
    public void checkContentTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkContent();
    }

    @Test
    public void checkItemTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = mock(OPFItem.class);
        when(item.hasDataURL()).thenReturn(false);
        checker.checkItem(item, mock(OPFHandler.class));
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(mock(OPFItem.class));
    }

    @Test
    public void checkSpineItemTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        OPFItem item = mock(OPFItem.class);
        when(item.hasDataURL()).thenReturn(false);
        checker.checkSpineItem(item, mock(OPFHandler.class));
    }

    @Test
    public void isAudioTypeTest() {
        String audioType = "audio/mpeg";
        assert (OPFChecker30.isAudioType(audioType));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        String audioType = "audio/mpeg";
        assert (OPFChecker30.isBlessedAudioType(audioType));
    }

    @Test
    public void isVideoTypeTest() {
        String videoType = "video/mp4";
        assert (OPFChecker30.isVideoType(videoType));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        String videoType = "video/mp4";
        assert (OPFChecker30.isBlessedVideoType(videoType));
    }

    @Test
    public void isCommonVideoTypeTest() {
        String videoType = "video/mp4";
        assert (OPFChecker30.isCommonVideoType(videoType));
    }

    @Test
    public void isFontTypeTest() {
        String fontType = "font/ttf";
        assert (OPFChecker30.isFontType(fontType));
    }

}