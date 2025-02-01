package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import io.mola.galimatias.GalimatiasParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;

public class GeneratedValidateFileUrlExceptionTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void validateFileUrlExceptionTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Invalid URL!");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"-m", "opf", "--v", "2.0", "notAValidURL"});
    }

}