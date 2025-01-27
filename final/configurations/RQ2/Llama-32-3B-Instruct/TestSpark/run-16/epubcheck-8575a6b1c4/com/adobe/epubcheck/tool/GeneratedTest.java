package com.adobe.epubcheck.tool;

public class GeneratedTest {

    private boolean isEpub2Compatible;

    public void setEpub2Compatibility(boolean isEpub2Compatible) {
        this.isEpub2Compatible = isEpub2Compatible;
    }

    public boolean getEpub2Compatibility() {
        return isEpub2Compatible;
    }
}

public class EpubChecker {
    private static EPUBProfile profile;

    public static void setProfile(EPUBProfile profile) {
        EpubChecker.profile = profile;
    }

    public static boolean isEpub2Compatible() {
        return profile.getEpub2Compatibility();
    }

    public static EPUBProfile getProfile() {
        return profile;
    }
}

public class Test {

}