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

public class GeneratedIsBlessedFontType_BlessedFontType_ReturnsTrue {

    @Test
    public void isBlessedFontType_BlessedFontType_ReturnsTrue() {
        // Arrange
        String type = "blessed_font";

        // Act
        boolean result = OPFChecker30.isBlessedFontType(type);

        // Assert
        assertTrue(result);
    }

}