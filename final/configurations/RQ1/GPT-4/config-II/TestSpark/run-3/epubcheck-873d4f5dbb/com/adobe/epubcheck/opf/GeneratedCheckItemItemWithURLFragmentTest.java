package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.url.URLFragment;
import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.util.outWriter;
import com.google.common.base.Optional;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

import static org.mockito.Mockito.*;

public class GeneratedCheckItemItemWithURLFragmentTest {

    @Test
    public void checkItemItemWithURLFragmentTest() {
        ValidationContext context = initContext();
        OPFChecker30 opfChecker = new OPFChecker30(context);

        OPFItem item = Mockito.mock(OPFItem.class);
        when(item.isRemote()).thenReturn(false);
        when(item.getURL().fragment()).thenReturn(URLFragment.parse("fragment"));
        OPFHandler handler = Mockito.mock(OPFHandler.class);

        opfChecker.checkItem(item, handler);

        verify(context.report, times(1)).message(MessageId.OPF_091, item.getLocation());
    }

}