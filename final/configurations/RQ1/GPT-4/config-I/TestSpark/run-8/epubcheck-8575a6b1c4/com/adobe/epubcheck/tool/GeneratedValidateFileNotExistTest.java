package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.*;
import com.adobe.epubcheck.util.PathUtil;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedValidateFileNotExistTest {

    @Test
    public void validateFileNotExistTest() {
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.validateFile("invalid.epub", EPUBVersion.VERSION_3, new DefaultReportImpl("invalid.epub"), EPUBProfile.DEFAULT);
        assertEquals(1, result);
    }

}