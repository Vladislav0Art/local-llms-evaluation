package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetBuildJobName() throws Exception {
        Mockito.when(AppVersion.getBuildJobName()).thenReturn("jenkins-job");
        assertEquals("jenkins-job", appVersion.getBuildJobName());
    }

}