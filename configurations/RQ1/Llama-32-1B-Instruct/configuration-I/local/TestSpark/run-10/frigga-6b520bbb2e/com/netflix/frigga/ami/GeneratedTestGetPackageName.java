package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPackageName() throws Exception {
        Mockito.when(AppVersion.getPackageName()).thenReturn("subscriberha");
        assertEquals("subscriberha", appVersion.getPackageName());
    }

}