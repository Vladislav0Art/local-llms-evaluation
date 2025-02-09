package com.adobe.epubcheck.tool;

public class GeneratedRun_InvalidArgsThrowsException {

    private EpubChecker eps;

    @Before
    public void setUp() throws Exception {
        eps = new EpubChecker();
    }

    @Test
    public void run_InvalidArgsThrowsException() {
        try {
            eps.run(new String[]{});
            fail("Expected exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(Messages.INVALID_ARGS, e.getMessage());
        }
    }

}