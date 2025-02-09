package com.adobe.epubcheck.tool;

public class GeneratedTestInvalidFilePath {

    private String version;

    public EpubVersion(String version) {
        if (version == null || !version.equals("3.0")) {
            throw new InvalidArgumentException("Invalid EPUB version");
        }
        this.version = version;
    }

    public int validateFile(File file) throws InvalidArgumentException {
        // validation logic
        return 1;
    }

    public static class InvalidArgumentException extends RuntimeException {
    }

    public static EpubVersion getInstance() {
        return new EpubVersion("3.0");
    }
}

public class TestEpubVersion {

    @Test
    public void testInvalidFilePath() throws Exception {
        File file = new File("/invalid/file.epub");
        EpubVersion version = null;
        try {
            int result = version.validateFile(file);
            fail();
        } catch (InvalidArgumentException e) {
            // expected
        }
    }

}