package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

    @Test
    public void testGetChangelist() {
        AppVersion appVersion = new AppVersion();
        String changelist = appVersion.getChangelist();
        assertNotNull(changelist);
    }

}