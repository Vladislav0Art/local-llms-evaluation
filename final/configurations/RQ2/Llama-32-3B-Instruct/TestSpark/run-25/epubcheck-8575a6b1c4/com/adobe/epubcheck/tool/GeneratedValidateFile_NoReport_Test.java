package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedValidateFile_NoReport_Test {

    @Test
    public void validateFile_NoReport_Test() {
        String path = "path/to/file";
        EPUBVersion version = Mockito.mock(EPUBVersion.class);
        Report report = null;
        EPUBProfile profile = Mockito.mock(EPUBProfile.class);
        int result = epubChecker.validateFile(path, version, report, profile);
    }

}