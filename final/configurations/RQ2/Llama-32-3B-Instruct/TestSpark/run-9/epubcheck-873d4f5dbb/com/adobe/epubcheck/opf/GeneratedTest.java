package com.adobe.epubcheck.opf;

public class GeneratedTest {

    public int getVersion() {
        return 1;
    }
}

public class PreferringMediaTypes {
    public String getPreferredMediaType(String mediaType, String path) {
        if (mediaType.equals("image") && path.endsWith(".jpg")) {
            return "image/jpeg";
        } else if (mediaType.equals("text") && path.endsWith(".txt")) {
            return "text/plain";
        }
        return null;
    }

    public void setPreferredMediaType(String mediaType) {
        this.preferredMediaType = mediaType;
    }
}

public class Tests {

    @Test
    public void testEPUBProfile() {
        EPUBProfile epubProfile = new EPUBProfile();
        epubProfile.setMediaType("image/jpeg");
        assertEquals("image/jpeg", epubProfile.getMediaType());
    }

    @Test
    public void testEPUBVersion() {
        EPUBVersion epubVersion = new EPUBVersion();
        int version = epubVersion.getVersion();
        assertEquals(1, version);
    }

    @Test
    public void testPreferringMediaTypes() {
        PreferringMediaTypes preferringMediaTypes = new PreferringMediaTypes();
        String preferredMediaType = preferringMediaTypes.getPreferredMediaType("image/jpeg", "test.jpg");
        assertNotNull(preferredMediaType);
        assertEquals("image/jpeg", preferredMediaType);

        preferredMediaType = preferringMediaTypes.getPreferredMediaType("text/plain", "test.txt");
        assertNotNull(preferredMediaType);
        assertEquals("text/plain", preferredMediaType);
    }

    @Test
    public void testNullAssert() {
        PreferringMediaTypes preferringMediaTypes = new PreferringMediaTypes();
        String preferredMediaType = preferringMediaTypes.getPreferredMediaType(null, null);
        assertNull(preferredMediaType);
    }

}