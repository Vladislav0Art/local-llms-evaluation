package com.adobe.epubcheck.tool;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.api.Report;

public class GeneratedProcessFileExceptionTest {

    @Test
    public void processFileExceptionTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{
                "-m", "opf",
                "-p", "DEFAULT",
                "-arfgvdasfop"
        });
        Assert.assertEquals(1, result);
    }

}