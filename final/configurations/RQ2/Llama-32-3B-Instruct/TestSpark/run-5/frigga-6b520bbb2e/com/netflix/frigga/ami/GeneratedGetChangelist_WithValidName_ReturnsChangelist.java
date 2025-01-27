package com.netflix.frigga.ami;

public class GeneratedGetChangelist_WithValidName_ReturnsChangelist {

    @Test
    public void getChangelist_WithValidName_ReturnsChangelist() {
        String changelist = "12345";
        AppVersion appVersion = new AppVersion("my-ami-" + changelist);
        assertEquals(changelist, appVersion.getChangelist());
    }

}