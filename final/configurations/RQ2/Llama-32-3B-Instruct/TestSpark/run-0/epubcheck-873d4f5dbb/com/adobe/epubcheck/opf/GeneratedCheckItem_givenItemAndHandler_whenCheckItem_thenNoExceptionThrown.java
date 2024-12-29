package com.adobe.epubcheck.opf;

public class GeneratedCheckItem_givenItemAndHandler_whenCheckItem_thenNoExceptionThrown {

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
    public void checkItem_givenItemAndHandler_whenCheckItem_thenNoExceptionThrown() {
        OPFItem item = new OPFItem();
        OPFHandler handler = new OPFHandler();
        checkItem(item, handler);
    }

}