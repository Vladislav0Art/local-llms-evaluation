package com.adobe.epubcheck.tool;

public class GeneratedRun_MultipleArgsReturnsCorrectValue {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void run_MultipleArgsReturnsCorrectValue() {
        int result = eps.run(new String[]{"arg1", "arg2"});
        assertEquals(1, result);
    }

}