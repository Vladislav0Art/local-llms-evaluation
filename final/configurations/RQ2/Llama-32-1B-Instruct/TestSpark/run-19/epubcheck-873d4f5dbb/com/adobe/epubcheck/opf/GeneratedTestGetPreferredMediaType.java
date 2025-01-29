package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType {

    @Test
    public void testGetPreferredMediaType() {
        assert opfChecker.getPreferredMediaType("application/x-font-otf", "/path/to/file.jpg") == "image/jpeg";
        assert opfChecker.getPreferredMediaType("", "/path/to/file.jpg") == null;
        assert opfChecker.getPreferredMediaType(null, "/path/to/file.jpg") == null;
    }

}