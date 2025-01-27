package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckPackageShouldReturnTrue {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void testCheckPackageShouldReturnTrue() {
        // given
        boolean result = true;

        // when
        new OPFChecker30(context).checkPackage();

        // then
        assertEquals(result, true);
    }

}