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
public class GeneratedProcessArgumentsHelpTest {

    @Mock
    EpubCheckFactory epubCheckFactory;

    @Test
    public void processArgumentsHelpTest() {
        EpubChecker checker = new EpubChecker();
        boolean processArguments = checker.processArguments(new String[]{"-h"});
        assertFalse(processArguments);
    }

}