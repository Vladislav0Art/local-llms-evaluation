package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPreferredMediaTypeInNestedClassWithSetter {

    @Test
    public void testGetPreferredMediaTypeInNestedClassWithSetter() {
        // Arrange
        PublicClass2 publicClass2 = new PublicClass2();
        publicClass2.setPublicMethod2("settedValue");

        // Act
        Object preferredMediaType = publicClass2.getPublicMethod2();

        // Assert
        assertEquals("settedValue", (String) preferredMediaType);
    }
}

}