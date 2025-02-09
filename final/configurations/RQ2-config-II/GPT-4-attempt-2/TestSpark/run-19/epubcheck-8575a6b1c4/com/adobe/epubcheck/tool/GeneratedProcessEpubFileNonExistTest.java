package com.adobe.epubcheck.tool;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.util.Locale;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProcessEpubFileNonExistTest {

    @Mock
    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void processEpubFileNonExistTest() {
        int expected = 1;
        String[] args = {"non_exist.epub", "en"};
        int actual = epubChecker.processEpubFile(args);
        Assert.assertEquals(expected, actual);
    }

}