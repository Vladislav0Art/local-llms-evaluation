package com.netflix.frigga.ami;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int hashcode = HashCodeUtil.hashCode(appVersion1, appVersion2);
        assertEquals(hashcode, 0);
    }
}

class AppVersion {

    private String packageName;
    private String version;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildJobName() {
        return "build job name";
    }

    public String getBuildNumber() {
        return "build number";
    }

    public String getCommit() {
        return "commit";
    }

    public String getChangelist() {
        return "changelist";
    }

    @Override
    public String toString() {
        return "AppVersion{" +
                "packageName='" + packageName + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public static int hashCode(AppVersion obj1, AppVersion obj2) {
        // Implement hash code calculation here
        return 0;
    }
}

class HashCodeUtil {

    public static int hashCode(Object... objects) {
        // Implement hash code calculation here
        return 0;
    }

}