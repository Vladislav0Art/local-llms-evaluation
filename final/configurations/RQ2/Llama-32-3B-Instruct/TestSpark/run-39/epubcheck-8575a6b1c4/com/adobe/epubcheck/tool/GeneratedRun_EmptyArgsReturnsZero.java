package com.adobe.epubcheck.tool;

public class GeneratedRun_EmptyArgsReturnsZero {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void run_EmptyArgsReturnsZero() {
        int result = eps.run(new String[]{});
        assertEquals(0, result);
    }

}