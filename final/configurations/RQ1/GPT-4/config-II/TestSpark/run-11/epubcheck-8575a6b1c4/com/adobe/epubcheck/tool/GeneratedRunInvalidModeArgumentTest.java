package com.adobe.epubcheck.tool;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;

public class GeneratedRunInvalidModeArgumentTest {

    @Test
    public void runInvalidModeArgumentTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{
                "-m",
                "test-file"
        });
        Assert.assertNotEquals(0, result);
    }

}