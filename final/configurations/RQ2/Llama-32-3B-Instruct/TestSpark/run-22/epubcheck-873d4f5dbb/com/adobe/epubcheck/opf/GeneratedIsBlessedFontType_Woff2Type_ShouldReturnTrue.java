package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedFontType_Woff2Type_ShouldReturnTrue {

    private OPFChecker30 checker;

    @Before
    public void init() {
        ValidationContext context = new ValidationContext();
        checker = new OPFChecker30(context);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void isBlessedFontType_Woff2Type_ShouldReturnTrue() {
        String type = "application/woff2";
        assertTrue(OPFChecker30.isBlessedFontType(type));
    }

}