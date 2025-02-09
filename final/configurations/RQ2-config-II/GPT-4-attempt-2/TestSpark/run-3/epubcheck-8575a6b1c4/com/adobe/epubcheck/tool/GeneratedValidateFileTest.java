package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.util.Messages;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.DefaultReportImpl;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValidateFileTest {

    private EpubChecker epubChecker = new EpubChecker();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void validateFileTest() {
        String path = "SomePath";
        EPUBVersion version = EPUBVersion.VERSION_3;
        Report report = new DefaultReportImpl(path);
        EPUBProfile profile = EPUBProfile.DEFAULT;

        int result = epubChecker.validateFile(path, version, report, profile);

        Assert.assertEquals(0, result);
    }

}