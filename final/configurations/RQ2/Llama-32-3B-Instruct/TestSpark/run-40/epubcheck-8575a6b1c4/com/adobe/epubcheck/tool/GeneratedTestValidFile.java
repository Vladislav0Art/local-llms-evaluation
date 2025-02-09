package com.adobe.epubcheck.tool;

public class GeneratedTestValidFile {

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
    public void testValidFile() throws Exception {
        File file = new File("valid_file.epub");
        try {
            int result = EpubVersion.getInstance().validateFile(file);
            Assert.assertEquals(1, result);
        } catch (InvalidArgumentException e) {
            fail(e.getMessage());
        }
    }

}