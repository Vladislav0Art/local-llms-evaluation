package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedGetLocaleTest {

    @Mock
    private Checker checker;

    @Mock
    private FileResourceProvider fileResourceProvider;

    @InjectMocks
    private EpubChecker epubChecker;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getLocaleTest() {
        assertEquals(Locale.ROOT, epubCheckergetLocale());
    }

}