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
public class GeneratedRunMockTest {

    private EpubChecker epubChecker = new EpubChecker();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void runMockTest() {
        EpubChecker epubCheckerMock = Mockito.mock(EpubChecker.class);
        Mockito.when(epubCheckerMock.run(Mockito.any(String[].class))).thenReturn(0);
        int exitCode = epubCheckerMock.run(new String[]{"somePath"});
        Mockito.verify(epubCheckerMock).run(new String[]{"somePath"});
        Assert.assertEquals(exitCode, 0);
    }

}