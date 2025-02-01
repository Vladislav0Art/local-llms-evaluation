package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.GenericResourceProvider;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.Field;
import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    EpubCheckFactory epubCheckFactory;

    @Test
    public void validateFileFileNotFoundTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile("wrong/path/file", null, null, null);
        assertEquals(1, result);
    }

    @Test
    public void validateFileUrlExceptionTest() {
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile("http://wrongurl", null, null, null);
        assertEquals(1, result);
    }

    @Test
    public void processArgumentsInvalidVersionTest() {
        EpubChecker checker = new EpubChecker();
        checker.processArguments(new String[]{"-v", "5.0"});
    }

    @Test
    public void processArgumentsVersion2Test() {
        EpubChecker checker = new EpubChecker();
        assertTrue(checker.processArguments(new String[]{"-v", "2.0", "path"}));
    }

    @Test
    public void processArgumentsVersion3Test() {
        EpubChecker checker = new EpubChecker();
        assertTrue(checker.processArguments(new String[]{"-v", "3.0", "path"}));
    }

    @Test
    public void processArgumentsInvalidModeTest() {
        EpubChecker checker = new EpubChecker();
        assertFalse(checker.processArguments(new String[]{"-m", "-invalid"}));
    }

    @Test
    public void processArgumentsGetsPathTest() {
        EpubChecker checker = new EpubChecker();
        boolean result = checker.processArguments(new String[]{"path"});
        try {
            Field privateField = EpubChecker.class.getDeclaredField("path");
            privateField.setAccessible(true);
            String pathFieldValue = (String) privateField.get(checker);
            assertEquals("path", pathFieldValue);
        } catch (Exception e) {
            fail();
        }

        assertTrue(result);
    }

    @Test
    public void processArgumentsLocaleTest() {
        EpubChecker checker = new EpubChecker();
        checker.processArguments(new String[]{"-locale", "de", "path"});
        assertEquals(Locale.GERMANY, checker.getLocale());
    }

    @Test
    public void processArgumentsHelpTest() {
        EpubChecker checker = new EpubChecker();
        boolean processArguments = checker.processArguments(new String[]{"-h"});
        assertFalse(processArguments);
    }

}