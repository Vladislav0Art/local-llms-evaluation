package com.adobe.epubcheck.opf;

public class GeneratedCheckContent_isFalseByDefault {

    private OPFChecker30 opfChecker30;
    private ValidationContext validationContext;

    @Before
    public void setup() {
        opfChecker30 = new OPFChecker30(validationContext);
        // set up mock for other dependencies if necessary
    }

    @Mock
    protected OPFHandler opfHandler;

    @Test
    public void checkContent_isFalseByDefault() {
        assertFalse(opfChecker30.checkContent());
    }

}