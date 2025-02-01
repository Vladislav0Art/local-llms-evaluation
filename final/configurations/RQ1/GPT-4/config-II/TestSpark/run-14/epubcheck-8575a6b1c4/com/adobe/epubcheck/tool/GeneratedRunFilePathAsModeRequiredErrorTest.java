package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import io.mola.galimatias.GalimatiasParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;

public class GeneratedRunFilePathAsModeRequiredErrorTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runFilePathAsModeRequiredErrorTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Some mode is needed!");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"/testFile"});
    }

}