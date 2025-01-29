package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaTypes_SimpleWithMultipleFiles {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testGetPreferredMediaTypes_SimpleWithMultipleFiles() {
        String type = "application/pdf";
        String[] files = {"/ebooks/2010/ebook-1.pdf", "/ebooks/2010/ebook-2.pdf"};
        for (String file : files) {
            boolean result = OPFChecker30.getPreferredMediaType(type, file);
            assertEquals("application/pdf", result);
        }
    }

}