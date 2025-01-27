package com.netflix.frigga.ami;

public class GeneratedGetChangelist_WithDeprecatedMethod_ReturnsChangelistViaDeprecatedMethod {

    @Test
    public void getChangelist_WithDeprecatedMethod_ReturnsChangelistViaDeprecatedMethod() {
        String changelist = "12345";
        AppVersion appVersion = new AppVersion("my-ami-" + changelist);
        assertEquals(changelist, appVersion.getChangelist());
    }

}