package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitHandlerTest {

    @Mock
    ValidationContext context;

    @Test
    public void initHandlerTest() {
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
        assertTrue(checker.opfHandler instanceof OPFHandler30);
    }

}