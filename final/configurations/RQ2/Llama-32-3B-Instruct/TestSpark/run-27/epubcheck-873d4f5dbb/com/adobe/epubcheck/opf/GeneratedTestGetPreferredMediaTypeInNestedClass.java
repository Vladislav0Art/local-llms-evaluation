package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPreferredMediaTypeInNestedClass {

    @Test
    public void testGetPreferredMediaTypeInNestedClass() {
        // Arrange
        PublicClass1 publicClass1 = new PublicClass1();

        // Act
        Object preferredMediaType = publicClass1.getPublicMethod1();

        // Assert
        assertEquals("publicMethod1", (String) preferredMediaType);
    }

}