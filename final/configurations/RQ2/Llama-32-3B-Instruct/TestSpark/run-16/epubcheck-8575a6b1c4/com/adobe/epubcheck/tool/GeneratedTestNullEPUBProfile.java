package com.adobe.epubcheck.tool;

public class GeneratedTestNullEPUBProfile {

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

    public static void setEPUBProfile(EPUBProfile profile) {
        if (profile == null) {
            throw new NullPointerException("Profile cannot be null");
        }
        setProfile(profile);
    }

    private static synchronized void setProfile(EPUBProfile profile) {
        EPUBProfile.setProfile = profile;
    }

    public static boolean isEpub2Compatible() {
        return getProfile().getEpub2Compatibility();
    }

    private static EPUBProfile getProfile() {
        if (profile == null) {
            throw new IllegalStateException("Profile not set");
        }
        synchronized (EpubChecker.class) {
            return profile;
        }
    }

    public static EPUBProfile getProfile() {
        return getProfile();
    }
}

public class EpubCheckerTests {

    @Test
    public void testNullEPUBProfile() {
        assertNull(EpubChecker.getProfile());
    }

}