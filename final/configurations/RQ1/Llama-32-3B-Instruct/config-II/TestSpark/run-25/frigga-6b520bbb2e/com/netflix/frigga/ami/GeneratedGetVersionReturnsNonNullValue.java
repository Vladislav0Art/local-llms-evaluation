package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersionReturnsNonNullValue {

    @Test
    public void getVersionReturnsNonNullValue() {
        AppVersion parsed = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertNotNull(parsed.version);
    }
}

public class AppVersion {

    private String packageName;
    private String version;

    public static AppVersion parseName(String amiName) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+-[a-zA-Z]+-[0-9]+");
        Matcher matcher = pattern.matcher(amiName);
        if (matcher.matches()) {
            return new AppVersion(matcher.group(1), matcher.group(2));
        } else {
            return null;
        }
    }

    public String getPackageName() {
        return packageName;
    }

    public String getVersion() {
        return version;
    }

}