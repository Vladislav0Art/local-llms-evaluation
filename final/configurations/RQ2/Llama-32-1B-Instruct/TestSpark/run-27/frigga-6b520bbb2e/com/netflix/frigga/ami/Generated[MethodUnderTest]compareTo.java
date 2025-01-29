package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.AppVersionTestUtils;
import org.junit.Test;

public class Generated[MethodUnderTest]

compareTo {

    @Test
    public void [MethodUnderTest]compareTo() {
        String[] packNames1 = {"pack-1", "pack-2"};
        String[] packNames2 = {"pack-1", "pack-3"};

        AppVersion appVersion1 = AppVersion.parseName("ami-name");
        AppVersion appVersion2 = AppVersion.parseName("ami-package-name");

        int result = appVersion.compareTo(appVersion2);
        Assert.assertEquals(-1, result); // should be -1 because it's less than packNames1[0]

        String[] packNames3 = {"pack-4", "pack-5"};
        Result result2 = AppVersion.parseName("ami-package-name");
        int result3 = appVersion.compareTo(result2);
        Assert.assertEquals(1, result3); // should be 1 because it's greater than packNames3[0]

        AppVersion appVersion4 = AppVersion.parseName("ami-package-name");

        Result result4 = AppVersion.parseName("ami-name");
        int result5 = appVersion.compareTo(result4);
        Assert.assertEquals(1, result5); // should be 1 because it's greater than packNames2[0]
    }

}