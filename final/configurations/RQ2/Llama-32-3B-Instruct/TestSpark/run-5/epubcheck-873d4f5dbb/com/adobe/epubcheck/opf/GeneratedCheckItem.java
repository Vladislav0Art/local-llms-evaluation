package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.w3c.epubcheck.api.EPUBLocation;
import org.w3c.epubcheck.api.EPUBProfile;
import org.w3c.epubcheck.api.FeatureReport;
import org.w3c.epubcheck.vocab.DCMESVocab;
import org.w3c.epubcheck.opf.OPFItem;
import org.w3c.epubcheck.opf.OPFHandler;

@RunWith(PowerMockito.class)
public class GeneratedCheckItem {

    OPFItem .class,OPFHandler .class
})

public class OpfItemTests {

    @Test
    public void checkItem() {
        // Arrange
        ValidationContext validationContext = new ValidationContext();
        OPFItem opfItem = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();

        // Act and Assert
        opfHandler.setEpubProfile(validationContext);
        PowerMockito.when(opfHandler.getEpubProfile()).thenReturn(new EPBUPrivateProfile());
        PowerMockito.when(opfItem.getClass()).thenReturn(OPFItem.class);

        assertTrue(opfChecker30.checkItemAfterResourceValidation(opfItem));
    }

}