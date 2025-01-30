package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedRunModeWithInvalidVersionTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runModeWithInvalidVersionTest() {
        exceptionRule.expect(InvalidVersionException.class);
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"-v", "5", "--mode", "opf", "testPath"});
    }

}