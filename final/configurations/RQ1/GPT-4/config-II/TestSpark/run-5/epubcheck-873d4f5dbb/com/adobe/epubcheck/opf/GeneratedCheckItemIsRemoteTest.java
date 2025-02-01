package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.google.common.base.Optional;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

public class GeneratedCheckItemIsRemoteTest {

    @Test
    public void checkItemIsRemoteTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        Report report = Mockito.mock(Report.class);
        Mockito.when(context.report).thenReturn(report);

        OPFItem item = Mockito.mock(OPFItem.class);
        Mockito.when(item.isRemote()).thenReturn(true); // Item is remote
        Mockito.when(item.getMimeType()).thenReturn("invalid/mime-type"); // No AudioType, VideoType, application/x-shockwave-flash or FontType
        Mockito.when(item.isInSpine()).thenReturn(true); // Item is in Spine
        Mockito.when(item.getLocation()).thenReturn(EPUBLocation.create("test.epub"));
        Mockito.when(item.getPath()).thenReturn("testPath");

        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItemAfterResourceValidation(item); // Calling method to be tested

        Mockito.verify(report).message(any(), any(), any());
    }

}