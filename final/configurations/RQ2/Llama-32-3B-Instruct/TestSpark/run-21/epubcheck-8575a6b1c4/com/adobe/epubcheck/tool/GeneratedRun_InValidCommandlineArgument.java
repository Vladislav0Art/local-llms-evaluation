package com.adobe.epubcheck.tool;

public class GeneratedRun_InValidCommandlineArgument {

    @Test
    public void run_InValidCommandlineArgument() throws Exception {
        String[] args = {"--invalid-argument"};
        try {
            EpubChecker instance = new EpubChecker();
            int result = instance.run(args);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

}