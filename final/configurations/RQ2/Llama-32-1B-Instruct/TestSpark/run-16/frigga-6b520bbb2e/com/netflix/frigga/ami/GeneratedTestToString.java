package com.netflix.frigga.ami;

public class GeneratedTestToString {

    private static final Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)\\-(.*)");

    public String getAmiName() {
        return pattern.matcher(getBuildJobName()).toString();
    }
}

public class AppVersionTest {

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion("ami-name");
        assertEquals("[AppVersion@...]", appVersion.toString());
    }

}