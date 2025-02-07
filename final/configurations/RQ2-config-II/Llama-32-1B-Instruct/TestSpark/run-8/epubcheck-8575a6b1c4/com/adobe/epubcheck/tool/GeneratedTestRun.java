package com.adobe.epubcheck.tool;

public class GeneratedTestRun {

    @Test
    public void testRun() throws Exception {
        File file = File.createTempFile("test", ".epub");
        FileWriter writer = new FileWriter(file);
        writer.write("This is a sample Epub file");
        writer.close();

        int result = checker.run(new String[]{"file", "-e", file.getAbsolutePath()});
        assertEquals(0, result);

        checkFile(file);
    }

}