package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        Assert.assertTrue(checker.checkPackage());
    }

}