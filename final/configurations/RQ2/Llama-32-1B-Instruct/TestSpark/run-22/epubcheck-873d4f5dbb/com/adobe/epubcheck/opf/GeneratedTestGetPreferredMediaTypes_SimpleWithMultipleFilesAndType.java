package com.adobe.epubcheck.opf;

public class GeneratedTestGetPreferredMediaTypes_SimpleWithMultipleFilesAndType {

    private MockOPFChecker30 mockOPFChecker30;

    @Before
    public void setup() {
        mockOPFChecker30 = new MockOPFChecker30();
    }

    @Test
    public void testGetPreferredMediaTypes_SimpleWithMultipleFilesAndType() {
        String type = "audio/mpeg";
        String[] preferredTypes = {"/ebooks/2010/ebook-math-ebook.mobi"};
        for (String preferredType : preferredTypes) {
            boolean result = OPFChecker30.getPreferredMediaType(type, preferredType);
            assertEquals("application/pdf", result);
        }
    }

    private MockOPFChecker30 mockOPFChecker30;

    public class MockOPFChecker30 {
        public void initHandler() {
        }

        @Override
        public boolean checkPackage() {
            return false;
        }

        @Override
        public boolean checkContent() {
            return true;
        }

        @Override
        protected void checkItem(OPFItem item, OPFHandler opfHandler) {
        }

        @Override
        protected void checkItemAfterResourceValidation(OPFItem item) {
        }

        @Override
        protected void checkSpineItem(OPFItem item, OPFHandler opfHandler) {
        }
    }

}