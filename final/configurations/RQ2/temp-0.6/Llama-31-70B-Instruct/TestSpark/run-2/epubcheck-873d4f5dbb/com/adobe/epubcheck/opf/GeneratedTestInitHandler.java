package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.util.EPUBVersion;

public class GeneratedTestInitHandler {

    @Test
    public void testInitHandler() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        OPFHandler opfHandler = mock(OPFHandler.class);
        checker.initHandler();
        verify(opfHandler).addPackageVocabs(PackageVocabs.CORE);
    }

}