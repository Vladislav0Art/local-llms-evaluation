package com.adobe.epubcheck.tool;

public class GeneratedTest {

    @Test
    public void testLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checkergetLocale();
        assertEquals(Locale.ENGLISH, locale);
    }

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

    @Test
    public void testValidateFile() {
        File file = new File("test.epub");
        EpubChecker checker = new EpubChecker();
        checker.validateFile(file.getAbsolutePath(), EPUBVersion .1_4, null, null);

        checkFile(file);
    }

    private void checkFile(File file) throws IOException {
        String[] args = {"file", "-validate"};
        int result = checker.run(args);
        assertTrue(result == 0);

        FileResourceProvider resourceProvider = new FileResourceProvider();
        String expectedPath = "expected_file.epub";
        Path expectedFile = Paths.get(expectedPath);
        URI actualFileUri = file.toURI().toURL();

        Matcher matcher = resourceProvider.findResources(Paths.get(file.getAbsolutePath()), Paths.get(actualFileUri));
        assertTrue(matcher.matches());

        Files.delete(file.toURI());
    }

    @Test
    public void testProcessEpubFile() {
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{"file", "-validate"});
        assertEquals(0, result);

        checkFile(new File("test.epub"));
    }

}