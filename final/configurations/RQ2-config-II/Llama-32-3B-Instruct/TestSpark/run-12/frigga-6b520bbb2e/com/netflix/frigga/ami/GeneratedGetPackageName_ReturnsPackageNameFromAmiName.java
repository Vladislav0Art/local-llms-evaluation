package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ReturnsPackageNameFromAmiName {

    @Test
    public void getPackageName_ReturnsPackageNameFromAmiName() {
        String amiName = "my-ami-name";
        assertEquals(amiName.split("-")[0], AppVersion.parseName(amiName).getPackageName());
    }

}