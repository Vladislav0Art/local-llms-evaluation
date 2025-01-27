package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.runners.JUnit4.classWithResources;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(classWithResources)
public class GeneratedCheckItem_ValidatesCheckItem {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkItem_ValidatesCheckItem() {
        OPFItem item = mock(OPFItem.class);
        when(item.getType()).thenReturn("type");
        when(context.getEPUBProfile()).thenReturn(new EPUBProfile());
        boolean result = new OPFChecker30(context).checkItem(item, opfHandler);
        verify(opfHandler).validateItem(item, result);
    }

}