package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemAfterResourceValidationShouldCheckSmilClock {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFItem item;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void checkItemAfterResourceValidationShouldCheckSmilClock() {
        // when
        when(item.getResourceValidationResult()).thenReturn(SmilClock.class);

        // then
        new OPFChecker30(context).checkItemAfterResourceValidation(item);
    }

}