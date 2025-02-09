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
public class GeneratedValidateFileNonExistTest {

    @Mock
    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void validateFileNonExistTest() {
        EpubChecker spyChecker = spy(epubChecker);
        String path = "non_exist.epub";
        int expected = 1;
        File file = new File(path);
        int actual = spyChecker.validateFile(path, EPUBVersion.VERSION_3, new DefaultReportImpl(file), EPUBProfile.DEFAULT);
        Assert.assertEquals(expected, actual);
    }

}