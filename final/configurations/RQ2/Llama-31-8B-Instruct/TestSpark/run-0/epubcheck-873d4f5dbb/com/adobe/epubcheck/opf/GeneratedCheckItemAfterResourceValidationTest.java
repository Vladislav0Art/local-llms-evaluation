package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.MetadataSet.Metadata;
import com.adobe.epubcheck.opf.ResourceCollection.Roles;
import com.adobe.epubcheck.util.EPUBVersion;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItemAfterResourceValidationTest {

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFItem item = mock(OPFItem.class);
        when(item.validate()).thenReturn(true);
        opfChecker30.checkItemAfterResourceValidation(item);
        verify(item).validate();
    }

}