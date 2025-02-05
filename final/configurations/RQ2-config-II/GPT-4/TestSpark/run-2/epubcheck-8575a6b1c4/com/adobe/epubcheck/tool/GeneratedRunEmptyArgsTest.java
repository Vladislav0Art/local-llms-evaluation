package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;
import org.mockito.Mockito;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class GeneratedRunEmptyArgsTest {

    @Test
    public void runEmptyArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};
        int result = epubChecker.run(args);

        // Assuming unsuccessful run due to no args returns 0
        assertEquals(0, result);
    }

}