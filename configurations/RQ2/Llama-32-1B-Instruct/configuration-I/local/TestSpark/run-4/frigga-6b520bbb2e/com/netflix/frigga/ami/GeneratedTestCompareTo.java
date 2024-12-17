package com.netflix.frigga.ami;

public class GeneratedTestCompareTo {

    private static String amiName;

    @Test
    public void TestCompareTo() {
        appVersion = new AppVersion();
        appVersion.compareTo(appVersion2);
        assertEquals(0, appVersion.compareTo(appVersion2));
    }

    @MockBean
    private Pattern pattern;

    @MockBean
    private AppVersion parseName;

    @Before
    public void setup() {
        when(parseName.amiName()).thenReturn(amiName);
    }

}