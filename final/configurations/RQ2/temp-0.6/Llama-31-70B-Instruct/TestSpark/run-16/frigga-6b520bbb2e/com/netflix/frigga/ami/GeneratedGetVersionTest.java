package com.netflix.frigga.ami;

public class GeneratedGetVersionTest {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void getVersionTest() {
        String expected = "testVersion";
        when(appVersion.getVersion()).thenReturn(expected);

        assertEquals(expected, appVersion.getVersion());
    }

}