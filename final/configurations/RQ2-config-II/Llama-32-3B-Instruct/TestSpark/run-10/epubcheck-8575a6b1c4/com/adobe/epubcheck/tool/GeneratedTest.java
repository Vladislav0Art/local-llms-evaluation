package com.adobe.epubcheck.tool;

public class GeneratedTest {

    private EpubChecker underTest = new EpubChecker();

    @Test
    public void getLocale

    localeForDefaultLocale() {
        Locale locale = underTestgetLocale();
        assertNotNull(locale);
        assertEquals(Locale.ENGLISH, locale);
    }

    @Test
    public void getLocale

    localeWithCustomLocale() {
        underTest.setLocale(Locale.FRENCH);
        Locale locale = underTest.Locale();
        assertNotNull(locale);
        assertEquals(Locale.FRENCH, locale);
    }

    @Test
    public void run_runCommandWithoutArgsSuccess() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath()};
        int result = underTest.run(args);
        assertTrue(result == 0);
        assertTrue(tmpFile.delete());
    }

    @Test
    public void run_runCommandWithArgSuccess() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epb");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--arg"};
        int result = underTest.run(args);
        assertTrue(result == 0);
        assertTrue(tmpFile.delete());
    }

    @Test
    public void run_runCommandWithArgFailure() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--invalid-arg"};
        int result = underTest.run(args);
        assertTrue(result != 0);
        assertTrue(tmpFile.delete());
    }

    @Test
    public void processEpubFile_processCommandWithoutArgsSuccess() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath()};
        int result = underTest.processEpubFile(args);
        assertTrue(result == 0);
        tmpFile.delete();
    }

    @Test
    public void processEpubFile_processCommandWithoutArgsFailure() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epb");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--invalid-arg"};
        int result = underTest.processEpubFile(args);
        assertTrue(result != 0);
        tmpFile.delete();
    }

    @Test
    public void validateFile_validateSuccess() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--validate"};
        int result = underTest.validateFile(tmpFile.getAbsolutePath(), null, null, null);
        assertTrue(result == 0);
        assertTrue(tmpFile.delete());
    }

    @Test
    public void validateFile_validateFailure() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".invalid");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--validate"};
        int result = underTest.validateFile(tmpFile.getAbsolutePath(), null, null, null);
        assertTrue(result != 0);
        assertTrue(tmpFile.delete());
    }

    @Test
    public void validateFile_validateWithEpubProfile() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".epub");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--validate", "--profile"};
        int result = underTest.validateFile(tmpFile.getAbsolutePath(), null, null, "profile1");
        assertTrue(result == 0);
        assertTrue(tmpFile.delete());
    }

    @Test
    public void validateFile_validateWithEpubProfileFailure() throws Exception {
        File tmpFile = File.createTempFile("tmp", ".invalid");
        String[] args = new String[]{tmpFile.getAbsolutePath(), "--validate", "--profile"};
        int result = underTest.validateFile(tmpFile.getAbsolutePath(), null, null, "profile1");
        assertTrue(result != 0);
        assertTrue(tmpFile.delete());
    }

}