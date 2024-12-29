package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import com.google.common.base.Optional;
import com.google.common.collect.Iterables;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 opfChecker = new OPFChecker30(context);
        OPFItem item = mock(OPFItem.class);
        OPFHandler opfHandler = mock(OPFHandler.class);
        opfChecker.checkItem(item, opfHandler);
        assertTrue(opfChecker.checkPackage());
    }

}