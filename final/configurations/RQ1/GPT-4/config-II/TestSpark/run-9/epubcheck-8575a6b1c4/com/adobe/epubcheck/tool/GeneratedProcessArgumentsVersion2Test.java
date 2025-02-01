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
public class GeneratedProcessArgumentsVersion2Test {

    @Mock
    EpubCheckFactory epubCheckFactory;

    @Test
    public void processArgumentsVersion2Test() {
        EpubChecker checker = new EpubChecker();
        assertTrue(checker.processArguments(new String[]{"-v", "2.0", "path"}));
    }

}