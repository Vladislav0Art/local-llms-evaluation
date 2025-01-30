package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import org.mockito.Mockito;

public class GeneratedCheckItemStartsWithMetaInfTest {

    @Test
    public void checkItemStartsWithMetaInfTest() {
        OPFItem item = mock(OPFItem.class);
        OPFHandler handler = mock(OPFHandler.class);

        when(item.getPath()).thenReturn("META-INF/");
        OPFChecker30 opfChecker = new OPFChecker30();
        opfChecker.checkItem(item, handler);
        Mockito.verify(item, times(1)).getPath();
    }

}