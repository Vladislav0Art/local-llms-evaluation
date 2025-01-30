package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.ValidationContext;
import org.junit.Assert;
import com.adobe.epubcheck.util.CheckingReport;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.messages.MessageId;
import io.mola.galimatias.URL;
import com.adobe.epubcheck.api.FeatureReport;

import java.util.Collections;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkPackage();
        verify(context, times(1)).getReferences();
        verify(context, times(1)).getFeatureReport();
    }

}