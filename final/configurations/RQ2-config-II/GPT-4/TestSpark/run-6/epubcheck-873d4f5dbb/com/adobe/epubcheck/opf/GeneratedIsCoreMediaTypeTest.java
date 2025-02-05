package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedIsCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("image/jpeg"));
        Assert.assertFalse(OPFChecker30.isCoreMediaType("audio/amr"));
    }

}