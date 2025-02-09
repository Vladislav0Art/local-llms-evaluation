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
public class GeneratedRunWithValidArgsTest {

    @Mock
    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void runWithValidArgsTest() {
        int expected = 0;
        String[] args = {"file.epub", "valid_arg"};
        int actual = epubChecker.run(args);
        Assert.assertEquals(expected, actual);
    }

}