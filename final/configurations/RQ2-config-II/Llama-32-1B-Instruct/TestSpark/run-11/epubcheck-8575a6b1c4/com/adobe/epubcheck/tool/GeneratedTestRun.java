package com.adobe.epubcheck.tool;

public class GeneratedTestRun {

    @Test
    public void testRun() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"path/to/your/file"};
        int result = checker.run(args);
        assertEquals(0, result); // You should not return any code here
    }

}