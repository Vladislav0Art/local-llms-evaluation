package com.adobe.epubcheck.opf;

public class GeneratedTestIsCoreMediaType_Simple {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testIsCoreMediaType_Simple() {
        String type = "application/ebook-binary";
        String path = "/ebooks/2010/ebook-math-ebook.mobi";
        boolean result = OPFChecker30.isCoreMediaType(type, path);
        assertEquals(true, result);
    }

}