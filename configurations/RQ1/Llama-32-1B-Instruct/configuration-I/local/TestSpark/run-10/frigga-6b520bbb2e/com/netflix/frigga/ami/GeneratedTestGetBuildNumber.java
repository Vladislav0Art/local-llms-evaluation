package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetBuildNumber() throws Exception {
        Mockito.when(AppVersion.getBuildNumber()).thenReturn("1");
        assertEquals("1", appVersion.getBuildNumber());
    }

}