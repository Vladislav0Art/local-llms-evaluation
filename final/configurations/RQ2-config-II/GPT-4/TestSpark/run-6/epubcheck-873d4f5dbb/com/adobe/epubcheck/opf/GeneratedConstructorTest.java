package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        Mockito.when(context.profile()).thenReturn(EPUBProfile.DEFAULT);
        OPFChecker30 checker = new OPFChecker30(context);
        Assert.assertNotNull(checker);
    }

}