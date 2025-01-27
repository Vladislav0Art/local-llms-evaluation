package com.adobe.epubcheck.opf;

public class GeneratedTestEPUBLocation {

    @Test
    public void testEPUBLocation() {
        EPUBLocation epubLocation = new EPUBLocation();
        assertEquals("path/to/location", (String) epubLocation.getLocation());
    }
}

class EPUBLocation {
    private String location;

    public EPUBLocation() {
        this.location = "path/to/location";
    }

    @Override
    public String toString() {
        return location;
    }
}

}