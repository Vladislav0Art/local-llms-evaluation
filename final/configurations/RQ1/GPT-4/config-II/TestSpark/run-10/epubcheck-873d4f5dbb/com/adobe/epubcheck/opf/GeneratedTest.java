package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.util.url.URLFragment;
import com.adobe.epubcheck.util.url.URLUtils;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.URI;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void checkItemInvalidMimeTypeTest() {
        OPFItem mockItem = mock(OPFItem.class);
        when(mockItem.getMimeType()).thenReturn("invalid/mime;type");
        ValidationContext mockContext = mock(ValidationContext.class);
        new OPFChecker30().checkItem(mockItem, mockContext);
    }

    @Test
    public void checkItemValidMimeTypeTest() {
        OPFItem mockItem = mock(OPFItem.class);
        when(mockItem.getMimeType()).thenReturn("application/audio");
        ValidationContext mockContext = mock(ValidationContext.class);
        new OPFChecker30().checkItem(mockItem, mockContext);
    }

    @Test
    public void checkItemDataURLTest() {
        OPFItem mockItem = mock(OPFItem.class);
        when(mockItem.hasDataURL()).thenReturn(true);
        ValidationContext mockContext = mock(ValidationContext.class);
        new OPFChecker30(mockContext).checkItem(mockItem, new OPFHandler(mockContext));
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem mockItem = mock(OPFItem.class);
        when(mockItem.isRemote()).thenReturn(true);
        when(mockItem.isAudioType()).thenReturn(true);
        ValidationContext mockContext = mock(ValidationContext.class);
        new OPFChecker30(mockContext).checkItemAfterResourceValidation(mockItem);
    }

    @Test
    public void checkSpineItemTest() {
        OPFItem mockItem = mock(OPFItem.class);
        when(mockItem.hasDataURL()).thenReturn(true);
        ValidationContext mockContext = mock(ValidationContext.class);
        new OPFChecker30(mockContext).checkSpineItem(mockItem, new OPFHandler(mockContext));
    }

    @Test
    public void checkSpineItemDataNavPropertyTest() {
        OPFItem mockItem = mock(OPFItem.class);
        when(mockItem.getProperties()).thenReturn(Collections.singletonList("data-nav"));
        ValidationContext mockContext = mock(ValidationContext.class);
        new OPFChecker30(mockContext).checkSpineItem(mockItem, new OPFHandler(mockContext));
    }

    @Test
    public void getPreferredMediaTypeTest() {
        String mimeType = "invalid/mime;type";
        String result = OPFChecker30.getPreferredMediaType(mimeType, "/path/to/resource");
        assertNull(result);
    }

    @Test
    public void isAudioTypeTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("audio/mpeg"));
    }

}