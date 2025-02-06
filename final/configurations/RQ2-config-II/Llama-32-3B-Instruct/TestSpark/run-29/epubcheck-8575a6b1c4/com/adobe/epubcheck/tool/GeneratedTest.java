package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockito.class)
public class GeneratedTest {

    @Mock
    private EPUBProfile profile;

    @Mock
    private EpubCheckFactory factory;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void getLocale_German

    LocaleReturned() {
        MockitoAnnotations.initMocks(this);
        PowerMockito.when(profile.getLocale()).thenReturn(Locale.GERMAN);
        assertEquals(Locale.GERMAN, epubCheckergetLocale());
    }

    @Test
    public void run_EpubCheckCommand() throws Exception {
        MockitoAnnotations.initMocks(this);
        String[] args = {"-check"};
        PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(args));
        String result = epubChecker.run(args);
        assertNotNull(result);
    }

    @Test
    public void run_withInvalidArgs_ThrowsException() {
        MockitoAnnotations.initMocks(this);
        String[] args = {"-a", "-b"};
        try {
            PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(args));
            epubChecker.run(args);
            fail("Expected ExceptionNotThrown");
        } catch (Exception e) {
            //expected
        }
    }

    @Test
    public void run_withFilePath_ContainsExtension_ReturnsReport() throws Exception {
        MockitoAnnotations.initMocks(this);
        String filePath = "path/to/epub/file.epub";
        PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
        PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(filePath));
        Report report = epubChecker.run(new String[]{"-check", "-o"});
        assertNotNull(report);
    }

    @Test
    public void run_withFileDoesNotContainExtension_ThrowsException() {
        MockitoAnnotations.initMocks(this);
        String filePath = "path/to/epub/file";
        try {
            PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
            PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(filePath));
            epubChecker.run(new String[]{"-check", "-o"});
            fail("Expected ExceptionNotThrown");
        } catch (Exception e) {
            //expected
        }
    }

    @Test
    public void validateFile_ValidateLocalFile() throws Exception {
        MockitoAnnotations.initMocks(this);
        String path = "path/to/valid/file.epub";
        PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
        PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(path));
        int result = epubChecker.validateFile(path, EPUBVersion.EPUB30, new DefaultReportImpl(), profile);
        assertEquals(0, result);
    }

    @Test
    public void validateFile_ValidateRemoteFile() throws Exception {
        MockitoAnnotations.initMocks(this);
        String path = "http://example.com/valid/file.epub";
        PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
        PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(path));
        int result = epubChecker.validateFile(path, EPUBVersion.EPUB30, new DefaultReportImpl(), profile);
        assertEquals(0, result);
    }

    @Test
    public void validateFile_InvalidFile() {
        MockitoAnnotations.initMocks(this);
        String path = "path/to/invalid/file.epub";
        try {
            PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
            PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(path));
            epubChecker.validateFile(path, EPUBVersion.EPUB30, new DefaultReportImpl(), profile);
            fail("Expected ExceptionNotThrown");
        } catch (Exception e) {
            //expected
        }
    }

    @Test
    public void validateFile_InvalidVersion() throws Exception {
        MockitoAnnotations.initMocks(this);
        String path = "path/to/valid/file.epub";
        PowerMockito.when(profile.getLocale()).thenReturn(Locale.English);
        PowerMockito.when(factory.createEpubCheck()).thenReturn(new EpubCheck(path));
        try {
            epubChecker.validateFile(path, EPUBVersion.INVALID_VERSION, new DefaultReportImpl(), profile);
            fail("Expected InvalidVersionException");
        } catch (InvalidVersionException e) {
            //expected
        }
    }

}