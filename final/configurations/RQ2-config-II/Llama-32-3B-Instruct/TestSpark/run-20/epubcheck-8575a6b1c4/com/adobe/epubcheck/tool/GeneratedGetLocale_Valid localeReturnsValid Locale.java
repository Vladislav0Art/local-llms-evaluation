package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetLocale_Valid localeReturnsValid Locale {

    @Mock
    private FileResourceProvider fileResourceProviderMock;

    @Mock
    private Report reportMock;

    @Mock
    private OPFChecker30 opfChecker30Mock;

    @Mock
    private OPSChecker opSCheckerMock;

    @Mock
    private OverlayChecker overlayCheckerMock;

    public void setFileResourceProvider(FileResourceProvider fileResourceProvider) {
        this.fileResourceProviderMock = fileResourceProvider;
    }

    public void setOPFChecker30(OPFChecker30 opfChecker30) {
        this.opfChecker30Mock = opfChecker30;
    }

    public void setOPSChecker(OPSChecker opSChecker) {
        this.opSCheckerMock = opSChecker;
    }

    public void setOverlayChecker(OverlayChecker overlayChecker) {
        this.overlayCheckerMock = overlayChecker;
    }

    @Test
    public void getLocale_Valid

    localeReturnsValid Locale() throws Exception {
        //Arrange
        Locale locale = new Locale("en", "US");

        //Act
        EpubChecker epubChecker = new EpubChecker();
        Locale result = epubChecker.getLocale();

        //Assert
        Mockito.when(fileResourceProviderMock.getLocale()).thenReturn(locale);
        assertSame(result, locale);
    }

}