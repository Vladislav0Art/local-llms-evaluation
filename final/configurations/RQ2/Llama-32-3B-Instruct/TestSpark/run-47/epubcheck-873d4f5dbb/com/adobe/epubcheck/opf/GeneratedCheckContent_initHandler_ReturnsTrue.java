package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.Collections;

import org.w3c.epubcheck.core.references.Reference;
import org.w3c.epubcheck.util.url.URLFragment;
import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.MetadataSet.Metadata;
import com.adobe.epubcheck.opf.ResourceCollection.Roles;
import org.mockito.Mockito;

public class GeneratedCheckContent_initHandler_ReturnsTrue {

    @Test
    public void checkContent_initHandler_ReturnsTrue() {
        // Arrange
        ValidationContext context = new ValidationContext();
        OPFChecker30 opfChecker30 = new OPFChecker30(context);

        // Act
        boolean result = opfChecker30.checkContent();

        // Assert
        assertTrue(result);
    }

}