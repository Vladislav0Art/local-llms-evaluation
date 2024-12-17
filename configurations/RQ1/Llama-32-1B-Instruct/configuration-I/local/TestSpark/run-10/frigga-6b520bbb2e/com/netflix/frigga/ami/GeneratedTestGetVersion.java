package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetVersion() throws Exception {
        Mockito.when(AppVersion.getVersion()).thenReturn("1.0.0-586499");
        assertEquals("1.0.0-586499", appVersion.getVersion());
    }

}