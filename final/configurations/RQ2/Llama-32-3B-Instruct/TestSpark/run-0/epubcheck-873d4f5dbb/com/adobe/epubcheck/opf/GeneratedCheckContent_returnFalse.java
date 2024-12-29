package com.adobe.epubcheck.opf;

public class GeneratedCheckContent_returnFalse {

    private String mediaType;

    public String getMediaType() {
        return "";
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
}

public class OPFItem {
}

public class OPFHandler {
}

public class OPFChecker30 {

    @Inject
    private ValidationContext validationContext;

    public void initHandler() {
    }

    @Test
    public void checkContent_returnFalse() {
        boolean result = checkContent();
        Assert.assertFalse(result);
    }

}