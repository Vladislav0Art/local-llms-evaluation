package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItem_ValidOPF {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> resources;

    @Test
    public void checkItem_ValidOPF() {
        when(context.checkItem(new OPFItem(), new OPFHandler())).thenReturn(true);
        boolean result = new OPFChecker30(context).checkItem(new OPFItem(), new OPFHandler());
        assertTrue(result);
    }

}