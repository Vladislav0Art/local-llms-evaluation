package com.adobe.epubcheck.tool;

public class GeneratedRun_InValidInputFileTest {

    @Test
    public void run_InValidInputFileTest() throws Exception {
        String[] args = {"--input-file", "non-existent-file"};
        try {
            EpubChecker instance = new EpubChecker();
            int result = instance.run(args);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

}