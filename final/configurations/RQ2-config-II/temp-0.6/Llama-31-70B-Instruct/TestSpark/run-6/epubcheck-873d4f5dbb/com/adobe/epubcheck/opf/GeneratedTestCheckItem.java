package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedTestCheckItem {

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Mock
    private EPUBProfile epubProfile;

    @Test
    public void testCheckItem() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        opfChecker30.checkItem(item, opfHandler);
    }

}