package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemAfterResourceValidationTest {

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem item = new OPFItem("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        opfChecker30.checkItemAfterResourceValidation(item);
        assertTrue(true);
    }

}