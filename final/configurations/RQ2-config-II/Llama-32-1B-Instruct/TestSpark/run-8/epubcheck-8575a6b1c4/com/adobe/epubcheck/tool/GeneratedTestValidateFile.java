package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFile {

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

}