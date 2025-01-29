package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaTypes_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testGetPreferredMediaTypes_Simple() {
        String type = "audio/mpeg";
        String[] preferredTypes = {"/ebooks/2010/ebook-math-ebook.mobi"};
        for (String preferredType : preferredTypes) {
            boolean result = OPFChecker30.getPreferredMediaType(type, preferredType);
            assertEquals("application/pdf", result);
        }
    }

}