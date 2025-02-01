package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.google.common.base.Optional;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

public class GeneratedCheckItemDataUrlTest {

    @Test
    public void checkItemDataUrlTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        Report report = Mockito.mock(Report.class);
        Mockito.when(context.report).thenReturn(report);

        OPFItem item = Mockito.mock(OPFItem.class);
        Mockito.when(item.hasDataURL()).thenReturn(true);
        Mockito.when(item.getLocation()).thenReturn(EPUBLocation.create("test.epub"));

        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.checkItem(item, opfHandler);
        Mockito.verify(report).message(any(), any());
    }

}