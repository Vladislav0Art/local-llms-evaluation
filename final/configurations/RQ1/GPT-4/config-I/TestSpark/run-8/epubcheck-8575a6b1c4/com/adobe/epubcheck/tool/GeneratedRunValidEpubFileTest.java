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

public class GeneratedRunValidEpubFileTest {

    @Test
    public void runValidEpubFileTest() throws IOException {
        File file = PathUtil.createTempFile("valid", ".epub");
        Files.copy(getClass().getResourceAsStream("/valid.epub"), file.toPath());
        EpubChecker epubChecker = new EpubChecker();
        int result = epubChecker.run(new String[]{file.getAbsolutePath()});
        assertEquals(0, result);
    }

}