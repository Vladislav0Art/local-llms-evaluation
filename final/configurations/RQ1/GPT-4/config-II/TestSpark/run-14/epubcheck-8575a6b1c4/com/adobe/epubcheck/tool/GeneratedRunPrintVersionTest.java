package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import io.mola.galimatias.GalimatiasParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;

public class GeneratedRunPrintVersionTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runPrintVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"--version"};
        epubChecker.run(args);
    }

}