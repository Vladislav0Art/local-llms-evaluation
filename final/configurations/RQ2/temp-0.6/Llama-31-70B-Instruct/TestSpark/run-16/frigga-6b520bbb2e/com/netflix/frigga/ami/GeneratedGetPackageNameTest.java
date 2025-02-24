package com.netflix.frigga.ami;

public class GeneratedGetPackageNameTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void getPackageNameTest() {
        String expected = "testName";
        when(appVersion.getPackageName()).thenReturn(expected);

        assertEquals(expected, appVersion.getPackageName());
    }

}