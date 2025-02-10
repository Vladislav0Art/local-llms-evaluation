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

public class GeneratedGetPreferredMediaType_PreferredMediaType_ReturnsString {

    @Test
    public void getPreferredMediaType_PreferredMediaType_ReturnsString() {
        // Arrange
        String type = "image";
        String path = "/path/to/image";

        // Act
        String result = OPFChecker30.getPreferredMediaType(type, path);

        // Assert
        assertNotNull(result);
    }

}