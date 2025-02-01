package com.adobe.epubcheck.tool;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;

public class GeneratedRunArgumentsLengthZeroTest {

    @Test
    public void runArgumentsLengthZeroTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{});
        Assert.assertEquals(1, result);
    }

}