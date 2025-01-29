package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testGetPreferredMediaType_Simple() {
        String type = "audio/mpeg";
        String preferredType = OPFChecker30.getPreferredMediaType(type, "/ebooks/2010/ebook-math-ebook.mobi");
        assertEquals("application/pdf", preferredType);
    }

}