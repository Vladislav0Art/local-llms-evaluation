package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetPreferredMediaType() {
        // Arrange
        String mediaType = "video/mp4";

        // Act
        Object preferredMediaType = getPreferredMediaType(mediaType);

        // Assert
        assertEquals("video/mp4", (String) preferredMediaType);
    }

    private Object getPreferredMediaType(String mediaType) {
        return mediaType;
    }

    public class PublicClass1 {
        public String getPublicMethod1() {
            return "publicMethod1";
        }
    }

    public class PublicClass2 {
        public String getPublicMethod2() {
            return "publicMethod2";
        }

        public void setPublicMethod2(String value) {
            this.publicMethod2 = value;
        }

        private String publicMethod2;
    }

}