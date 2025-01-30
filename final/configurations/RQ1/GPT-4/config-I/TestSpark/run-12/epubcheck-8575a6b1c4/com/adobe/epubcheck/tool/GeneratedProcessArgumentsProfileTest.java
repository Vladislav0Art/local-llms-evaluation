package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.mockito.Mockito.*;

public class GeneratedProcessArgumentsProfileTest {

    @Test
    public void processArgumentsProfileTest() {
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.processArguments(new String[]{"-p"});
    }

}