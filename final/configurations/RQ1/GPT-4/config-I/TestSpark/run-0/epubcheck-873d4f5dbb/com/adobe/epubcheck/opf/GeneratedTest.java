package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.*;
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
    public void checkContentTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkContent();
    }

    @Test
    public void checkItemTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        OPFItem item = mock(OPFItem.class);
        when(item.getLocation()).thenReturn(mock(EPUBLocation.class));
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(item, opfHandler);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFItem item = mock(OPFItem.class);
        when(item.getLocation()).thenReturn(mock(EPUBLocation.class));
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(item);
    }

    @Test
    public void checkSpineItemTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        OPFItem item = mock(OPFItem.class);
        when(item.getLocation()).thenReturn(mock(EPUBLocation.class));
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkSpineItem(item, opfHandler);
    }

    @Test
    public void isAudioTypeTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.isAudioType("audio/mp3");
    }

    @Test
    public void isCommonVideoTypeTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.isCommonVideoType("video/mp4");
    }

    @Test
    public void isFontTypeTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.isFontType("font/ttf");
    }

}