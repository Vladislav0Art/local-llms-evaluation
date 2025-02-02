package com.netflix.frigga.ami;

public class GeneratedParseName_ValidPattern_MissingCommit_ReturnsInstance {

    @Test
    public void parseName_ValidPattern_MissingCommit_ReturnsInstance() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals("subscriberha", result.getPackageName());
        assertEquals("1.0.0-586499", result.getVersion());
        assertNull(result.getCommit());
    }

    public static class AppVersion {
        private String packageName;
        private String version;
        private String buildNumber;
        private String commit;

        public AppVersion(String packageName, String version) {
            this.packageName = packageName;
            this.version = version;
        }

        public static AppVersion parseName(String amiName) {
            // implementation to extract package name and version from amiName
            return new AppVersion(amiName.split("-")[0], amiName);
        }

        public String getPackageName() {
            return packageName;
        }

        public String getVersion() {
            return version;
        }

        public String getBuildJobName() {
            return buildNumber;
        }

        public String getBuildNumber() {
            return buildNumber;
        }

        public String getCommit() {
            return commit;
        }
    }

}