package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest_getChangelist {

    @Test
    public void test_getChangelist() {
        AppVersion appVersion = new AppVersion();
        String changelist = appVersion.getChangelist();
        assertEquals(null, changelist);
    }

}