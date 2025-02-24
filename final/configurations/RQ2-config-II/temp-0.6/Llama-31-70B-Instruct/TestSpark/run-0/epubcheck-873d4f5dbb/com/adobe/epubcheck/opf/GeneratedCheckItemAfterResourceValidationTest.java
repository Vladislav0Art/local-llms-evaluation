package com.adobe.epubcheck.opf;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemAfterResourceValidationTest {

    private OPFChecker30 opfChecker;

    @Mock
    private ValidationContext validationContext;

    @Before
    public void setUp() {
        opfChecker = new OPFChecker30(validationContext);
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem item = mock(OPFItem.class);

        opfChecker.checkItemAfterResourceValidation(item);

        // add verification here
    }

}