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
public class GeneratedProcessArgumentsGetsPathTest {

    @Mock
    EpubCheckFactory epubCheckFactory;

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

}