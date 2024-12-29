package com.adobe.epubcheck.opf;

public class GeneratedIsBlessedAudioType_givenMediaTypesThenReturnFalse {

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
    public void isBlessedAudioType_givenMediaTypesThenReturnFalse() {
        boolean result = isBlessedAudioType("audio");
        Assert.assertFalse(result);
    }

}