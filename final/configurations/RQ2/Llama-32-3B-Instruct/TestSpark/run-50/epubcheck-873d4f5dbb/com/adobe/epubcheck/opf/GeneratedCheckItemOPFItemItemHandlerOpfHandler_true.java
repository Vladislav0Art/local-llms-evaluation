package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemOPFItemItemHandlerOpfHandler_true {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void checkItemOPFItemItemHandlerOpfHandler_true() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);

        // When and Then
        boolean result = OPFChecker30.checkItem(item, opfHandler);
        assertTrue(result);
    }

}