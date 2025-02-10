package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckSpineItemOPFItemReturnTrue {

    @Mock
    private ValidationContext context;

    @Mock
    private Reference ref1;
    @Mock
    private Reference ref2;

    @Spy
    private OPFChecker30 opfChecker30;

    @InjectMocks
    private OPFChecker30 opfChecker30UnderTest;

    @Test
    public void checkSpineItemOPFItemReturnTrue() {
        OPFItem item = new OPFItem();
        boolean result = opfChecker30UnderTest.checkSpineItem(item, null);
        assertTrue(result);
    }

}