package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import io.mola.galimatias.GalimatiasParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;

public class GeneratedRunListChecksTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runListChecksTest() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        int exitCode = epubChecker.run(new String[]{"-l"});

        assertEquals("Should return value 0", 0, exitCode);
    }

}