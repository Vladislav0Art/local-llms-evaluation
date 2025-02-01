package com.adobe.epubcheck.tool;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;

public class GeneratedRunValidArgumentsTest {

    @Test
    public void runValidArgumentsTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{
                "-m", "opf",
                "-p", "DEFAULT",
                "-v", "3",
                "test-file"
        });
        Assert.assertNotEquals(1, result);
    }

}