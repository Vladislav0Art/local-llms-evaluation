package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.util.Messages;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GeneratedValidateFileNonExistentTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void validateFileNonExistentTest() {
        EpubChecker epubChecker = new EpubChecker();
        int returnValue = epubChecker.validateFile("nonexistentpath", null, null, null);
        Assert.assertEquals(1, returnValue);
    }

}