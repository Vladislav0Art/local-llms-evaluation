package com.adobe.epubcheck.opf;

public class GeneratedGetPreferredMediaType_NullPath_ShouldThrowNullPointerException {

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
    public void getPreferredMediaType_NullPath_ShouldThrowNullPointerException() {
        String type = "video/mp4";
        assertThrows(NullPointerException.class, () -> OPFChecker30.getPreferredMediaType(type, null));
    }
}

public class ValidationContext {

}

public class OPFItem implements OPFItemInterface {

    public static final int STATUS_OK = 0;

    @Override
    public int getStatus() {
        return STATUS_OK;
    }

    @Override
    public void setStatus(int status) {
    }

    @Override
    public String toString() {
        return "OPFItem";
    }
}

}