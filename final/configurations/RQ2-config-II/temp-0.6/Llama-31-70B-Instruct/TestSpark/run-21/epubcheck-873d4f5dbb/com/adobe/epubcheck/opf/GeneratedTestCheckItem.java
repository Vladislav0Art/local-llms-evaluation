package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckItem {

    @Mock
    private ValidationContext context;

    @Test
    public void testCheckItem() {
        OPFChecker30 testChecker = new OPFChecker30(context);
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        testChecker.checkItem(item, opfHandler);
    }

}