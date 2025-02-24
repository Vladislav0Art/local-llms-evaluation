package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackageCalled {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker = new OPFChecker30(context);

    @Test
    public void checkPackageCalled() {
        opfChecker.checkPackage();

        verify(opfChecker, times(1)).checkMetadata();
        verify(opfChecker, times(1)).checkManifest();
        verify(opfChecker, times(1)).checkSpine();
        verify(opfChecker, times(1)).checkBindings();
    }

}