package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_ReturnsFalseForDifferentObjects {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void equals_ReturnsFalseForDifferentObjects() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        boolean result = appVersion1.equals(appVersion2);
        assert result == false;
    }

    private Pattern getAppVersionPattern() {
        return getAppVersionPatternMock;
    }
}

public class AppVersion {

    private String buildNumber;
    private String commit;
    private String jobId;

    public String toString() {
        return "com.netflix.frigga.ami/" + buildNumber;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        AppVersion appVersion = (AppVersion) obj;
        return buildNumber.equals(appVersion.buildNumber);
    }

}