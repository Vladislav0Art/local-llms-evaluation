package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker = new OPFChecker30(context);

    @Test
    public void initHandlerCalled() {
        opfChecker.initHandler();

        verify(context, times(1)).setProperty(eq("is-scripted"), eq(false));
        verify(context, times(1)).setProperty(eq("has-fixed-layout"), eq(false));
        verify(context, times(1)).setProperty(eq("has-svg"), eq(false));
        verify(context, times(1)).setProperty(eq("has-xhtml"), eq(false));
        verify(context, times(1)).setProperty(eq("has-mathml"), eq(false));
        verify(context, times(1)).setProperty(eq("has-remote-resources"), eq(false));
        verify(context, times(1)).setProperty(eq("has-encryption"), eq(false));
    }

    @Test
    public void checkPackageCalled() {
        opfChecker.checkPackage();

        verify(opfChecker, times(1)).checkMetadata();
        verify(opfChecker, times(1)).checkManifest();
        verify(opfChecker, times(1)).checkSpine();
        verify(opfChecker, times(1)).checkBindings();
    }

}