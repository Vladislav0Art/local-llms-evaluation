package com.adobe.epubcheck.opf;

public class GeneratedInitHandler_isTrueWhenCalled {

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
    public void initHandler_isTrueWhenCalled() {
        when(opfChecker30.initHandler()).thenReturn(true);
        assertTrue(opfChecker30.initHandler());
    }

}