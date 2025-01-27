package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckContentShouldReturnFalse {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void testCheckContentShouldReturnFalse() {
        // given
        boolean result = false;

        // when
        new OPFChecker30(context).checkContent();

        // then
        assertEquals(result, false);
    }

}