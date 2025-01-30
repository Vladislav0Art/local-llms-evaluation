package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.url.URLFragment;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.vocab.PublicationType;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCheckSpineItemTest {

    @Test
    public void checkSpineItemTest() {
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());
        OPFItem item = Mockito.mock(OPFItem.class);
        Mockito.when(item.hasDataURL()).thenReturn(false);
        Mockito.when(item.getMimeType()).thenReturn("");
        Mockito.when(item.isBlessedItemType()).thenReturn(true);
        checker.checkSpineItem(item, Mockito.mock(OPFHandler.class));
        Mockito.verify(item, Mockito.times(0)).getLocation();
    }

}