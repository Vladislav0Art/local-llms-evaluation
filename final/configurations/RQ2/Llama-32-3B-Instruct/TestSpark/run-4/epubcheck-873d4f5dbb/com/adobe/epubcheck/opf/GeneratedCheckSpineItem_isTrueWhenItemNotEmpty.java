package com.adobe.epubcheck.opf;

public class GeneratedCheckSpineItem_isTrueWhenItemNotEmpty {

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
    public void checkSpineItem_isTrueWhenItemNotEmpty() throws Exception {
        OPFItem item = new OPFItem();
        item.getMetadata().ifPresent(metadata -> metadata.ifPresent(m -> {
        }));
        when(opfChecker30.checkSpineItem(item, opfHandler)).thenReturn(true);
        assertTrue(opfChecker30.checkSpineItem(item, opfHandler));
    }

}