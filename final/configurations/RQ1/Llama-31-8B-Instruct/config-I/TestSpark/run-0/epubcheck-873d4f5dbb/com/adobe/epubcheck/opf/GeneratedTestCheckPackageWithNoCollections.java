package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.google.common.base.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckPackageWithNoCollections {

    @Mock
    private OPFHandler30 opfHandler;

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker;

    @Test
    public void testCheckPackageWithNoCollections() {
        when(context.getProfile()).thenReturn(EPUBProfile.EPUB3);
        when(opfHandler.getCollections()).thenReturn(Optional.empty());
        when(opfHandler.getLinkedResources()).thenReturn(new LinkedResources());
        when(opfHandler.getMetadata()).thenReturn(new MetadataSet());
        when(opfHandler.getItemByURL(any())).thenReturn(Optional.of(new OPFItem()));
        when(opfHandler.getItemById(any())).thenReturn(Optional.of(new OPFItem()));
        assertTrue(opfChecker.checkPackage());
    }

}