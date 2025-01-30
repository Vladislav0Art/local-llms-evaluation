package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.util.EPUBVersion;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedCheckItemAfterResourceValidationWithItemInSpineTest {

    @Test
    public void checkItemAfterResourceValidationWithItemInSpineTest() {
        OPFChecker30 checker = new OPFChecker30(Report.createReport("test", EPUBVersion.VERSION_3));
        OPFItem item = Mockito.mock(OPFItem.class);
        when(item.isInSpine()).thenReturn(true);
        when(item.isRemote()).thenReturn(true);
        checker.checkItemAfterResourceValidation(item);
        verify(item, Mockito.times(2)).getLocation();
    }

}