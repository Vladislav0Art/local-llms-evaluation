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
public class GeneratedValidateFile_InvalidFileReturnsNegativeNumber {

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
    public void validateFile_InvalidFileReturnsNegativeNumber() throws Exception {
        //Arrange
        String path = "path/to/invalid/file.epub";
        EPUBVersion version = new EPUBVersion("1.0");

        //Act
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile(path, version);

        //Assert
        Mockito.when(opfChecker30Mock.validate()).thenReturn(-1);
        assertEquals(-1, result);
    }

}