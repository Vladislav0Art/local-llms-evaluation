package com.adobe.epubcheck.opf;

public class GeneratedTest {

    private ValidationContext validationContext;

    public OPFChecker(ValidationContextBuilder builder) {
        this.validationContext = builder.build();
    }

    public boolean isAudioType(String mediaType) {
        return validationContext.isMediaTypeAllowed(mediaType, MediaTypes.AUDIO);
    }

    public boolean isVideoType(String mediaType) {
        return validationContext.isMediaTypeAllowed(mediaType, MediaTypes.VIDEO);
    }
}

public class TestOPFChecker30 {

}