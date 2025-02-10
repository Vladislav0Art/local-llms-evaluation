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

public class GeneratedIsCoreMediaType_CoreMediaType_ReturnsTrue {

    @Test
    public void isCoreMediaType_CoreMediaType_ReturnsTrue() {
        // Arrange
        String type = "core_media";

        // Act
        boolean result = OPFChecker30.isCoreMediaType(type);

        // Assert
        assertTrue(result);
    }

}