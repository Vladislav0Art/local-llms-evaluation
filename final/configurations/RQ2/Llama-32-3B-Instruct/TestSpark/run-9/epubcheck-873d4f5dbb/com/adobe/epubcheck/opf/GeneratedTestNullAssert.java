package com.adobe.epubcheck.opf;

public class GeneratedTestNullAssert {

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
    public void testNullAssert() {
        PreferringMediaTypes preferringMediaTypes = new PreferringMediaTypes();
        String preferredMediaType = preferringMediaTypes.getPreferredMediaType(null, null);
        assertNull(preferredMediaType);
    }

}