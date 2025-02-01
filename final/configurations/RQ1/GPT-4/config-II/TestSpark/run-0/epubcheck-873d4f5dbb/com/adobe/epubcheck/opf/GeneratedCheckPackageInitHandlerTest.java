package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.util.FeatureEnum;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collections;

import static org.mockito.Mockito.*;

public class GeneratedCheckPackageInitHandlerTest {

    @Test
    public void checkPackageInitHandlerTest() {
        ValidationContext mockContext = mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(mockContext);
        opfChecker30.initHandler();
        verify(mockContext, times(0)).setVersion(any());
    }

}