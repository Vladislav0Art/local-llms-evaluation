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
public class GeneratedRunWithInvalidArgsTest {

    @Mock
    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void runWithInvalidArgsTest() {
        int expected = 1;
        String[] args = {"file.epub", "invalid_arg"};
        int actual = epubChecker.run(args);
        Assert.assertEquals(expected, actual);
    }

}