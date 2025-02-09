package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() throws IOException {
        Report report = Mockito.mock(Report.class);
        URL url = Mockito.mock(URL.class);
        List<String> list = Mockito.mock(List.class);
        ValidationContext validationContext = new ValidationContext(EPUBVersion.VERSION_3, report, url, list);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        boolean result = opfChecker30.checkPackage();
        assertTrue(result);
        Mockito.verify(report, Mockito.times(1)).info(Mockito.any(), Mockito.any(), Mockito.any());
    }

}