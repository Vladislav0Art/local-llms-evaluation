package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[getCommit-nullInput_ReturnsEmptyString]{

@Test
public void [getCommit-nullInput_ReturnsEmptyString](){

assertNull(AppVersion.getCommit(null));
        }
        }

public class AppVersion {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

    public static AppVersion parseName(String name) {
        // Implementation of the parser
        return new AppVersion();
    }

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

}