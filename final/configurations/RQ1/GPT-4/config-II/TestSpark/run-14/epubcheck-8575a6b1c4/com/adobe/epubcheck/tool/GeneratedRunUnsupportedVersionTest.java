package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import io.mola.galimatias.GalimatiasParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;

public class GeneratedRunUnsupportedVersionTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runUnsupportedVersionTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Unsupported version");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"--v", "5.0", "/test.epub"});
    }

}