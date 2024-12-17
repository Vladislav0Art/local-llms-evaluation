package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetCommit() throws Exception {
        Mockito.when(AppVersion.getCommit()).thenReturn("");
        assertEquals("", appVersion.getCommit());
    }

}