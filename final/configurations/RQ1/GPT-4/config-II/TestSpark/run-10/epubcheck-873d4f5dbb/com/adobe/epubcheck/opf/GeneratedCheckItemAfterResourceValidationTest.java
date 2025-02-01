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
public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem mockItem = mock(OPFItem.class);
        when(mockItem.isRemote()).thenReturn(true);
        when(mockItem.isAudioType()).thenReturn(true);
        ValidationContext mockContext = mock(ValidationContext.class);
        new OPFChecker30(mockContext).checkItemAfterResourceValidation(mockItem);
    }

}