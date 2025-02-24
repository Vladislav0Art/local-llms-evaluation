package com.adobe.epubcheck.opf;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckSpineItemTest {

    private OPFChecker30 opfChecker;

    @Mock
    private ValidationContext validationContext;

    @Before
    public void setUp() {
        opfChecker = new OPFChecker30(validationContext);
    }

    @Test
    public void checkSpineItemTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler opfHandler = mock(OPFHandler.class);

        opfChecker.checkSpineItem(item, opfHandler);

        // add verification here
    }

}