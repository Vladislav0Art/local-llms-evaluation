package com.adobe.epubcheck.tool;

public class GeneratedTest {

    private String version;

    public static EpubVersion getInstance() {
        return new EpubVersion("3.0");
    }

    public int validateFile(File file) throws InvalidArgumentException {
        // validation logic
        return 1;
    }
}

public class EpubVersion {
    private String version;

    public EpubVersion(String version) {
        if (version == null || !version.equals("3.0")) {
            throw new InvalidArgumentException();
        }
        this.version = version;
    }

    public static class InvalidArgumentException extends RuntimeException {
    }

    public int validateFile(File file) throws InvalidArgumentException {
        // validation logic
        return 1;
    }

    public File getInvalidVersion() throws InvalidArgumentException {
        if (version == null || !version.equals("3.0")) {
            throw new InvalidArgumentException();
        }
        return new File("/invalid/file.epub");
    }
}

public class TestEpubChecker {

}