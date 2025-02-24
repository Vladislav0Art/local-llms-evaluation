package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitHandlerTest {

    @Mock
    private OPFChecker30 opfChecker30;

    @Test
    public void initHandlerTest() {
        opfChecker30.initHandler();
        Assert.assertTrue(opfChecker30.checkPackage());
        Assert.assertTrue(opfChecker30.checkContent());
    }

}