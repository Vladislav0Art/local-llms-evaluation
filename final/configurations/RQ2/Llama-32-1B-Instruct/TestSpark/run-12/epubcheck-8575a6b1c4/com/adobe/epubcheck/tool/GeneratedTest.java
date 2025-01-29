package com.adobe.epubcheck.tool;

public class GeneratedTest {

    private static final String LOCALIZED_REPORT = "LOCALIZED_REPORT";
    private static final String SIMPLE_REPORT = "SIMPLE_REPORT";

    @Test
    public void test_validate_file_00() {
        EpubCheck check = new EpubChecker();
        EpubProfile profile = EPUBProfile.getDefault();

        // Mocking the Checker object
        EpubCheckChecker mockChecker = new EpubCheckCheckerImpl(check, profile);

        // Assert that the method returns an integer (should be 0)
        assertEquals(0, mockChecker.validateFile(null, null, null, null));
    }

    @Test
    public void test_validate_file_01() {
        EpubCheck check = new EpubChecker();
        String[] args = {null, "2022-07-25", SIMPLE_REPORT, EPUBProfile.getDefault()};

        // Mocking the Checker object
        EpubCheckChecker mockChecker = new EpubCheckCheckerImpl(check, null);

        // Assert that the method returns an integer (should be 0)
        assertEquals(0, mockChecker.validateFile(null, null, args, null));
    }

    @Test
    public void test_validate_file_02() {
        EpubCheck check = new EpubChecker();
        String[] args = {null, "2022-07-25", SIMPLE_REPORT, EPUBProfile.getDefault()};

        // Mocking the Checker object
        EpubCheckChecker mockChecker = new EpubCheckCheckerImpl(check, null);

        // Assert that the method returns an integer (should be 0)
        assertEquals(0, mockChecker.validateFile(null, "2022-07-25", args, null));
    }

    @Test
    public void test_validate_file_03() {
        EpubCheck check = new EpubChecker();
        String[] args = {null, "2022-07-25", SIMPLE_REPORT, EPUBProfile.getDefault()};

        // Mocking the Checker object
        EpubCheckChecker mockChecker = new EpubCheckCheckerImpl(check, null);

        // Assert that the method returns an integer (should be 0)
        assertEquals(0, mockChecker.validateFile("2022-07-25", args, null, null));
    }

    @Test
    public void test_validate_file_04() {
        EpubCheck check = new EpubChecker();
        String[] args = {null, "2022-07-25", SIMPLE_REPORT, EPUBProfile.getDefault()};

        // Mocking the Checker object
        EpubCheckChecker mockChecker = new EpubCheckCheckerImpl(check, null);

        // Assert that the method returns an integer (should be 0)
        assertEquals(0, mockChecker.validateFile(null, "2022-07-25", args, EPUBProfile.getDefault()));
    }

    @Test
    public void test_validate_file_05() {
        EpubCheck check = new EpubChecker();
        String[] args = {null, "2022-07-25", SIMPLE_REPORT, null};

        // Mocking the Checker object
        EpubCheckChecker mockChecker = new EpubCheckCheckerImpl(check, EPUBProfile.getDefault());

        // Assert that the method returns an integer (should be 0)
        assertEquals(0, mockChecker.validateFile(null, "2022-07-25", args, null));
    }

    @Test
    public void test_validate_file_06() {
        EpubCheck check = new EpubChecker();
        String[] args = {null, "2022-07-25", SIMPLE_REPORT, null};

        // Mocking the Checker object
        EpubCheckChecker mockChecker = new EpubCheckCheckerImpl(check, EPUBProfile.getDefault());

        // Assert that the method returns an integer (should be 0)
        assertEquals(0, mockChecker.validateFile(null, "2022-07-25", args, null));
    }

    @Test
    public void test_validate_file_07() {
        EpubCheck check = new EpubChecker();
        String[] args = {null, "2022-07-25", SIMPLE_REPORT, EPUBProfile.getDefault()};
        File file = new File("example.epub");
        EpubResourceProvider resourceProvider = new GenericResourceProvider(file);

        // Mocking the Checker object
        EpubCheckChecker mockChecker = new EpubCheckCheckerImpl(check, null);

        // Assert that the method returns an integer (should be 0)
        assertEquals(0, mockChecker.validateFile(null, "2022-07-25", resourceProvider, EPUBProfile.getDefault()));
    }

}

class EpubCheckCheckerImpl extends EpubCheckChecker {
    private final EpubCheck checker;

    public EpubCheckCheckerImpl(EpubCheck checker, EPUBProfile profile) {
        this.checker = checker;
    }

    @Override
    public int validateFile(String path, EPUBVersion version, Report report, EPUBProfile profile) {
        // Implementation
    }
}

class EpubCheckChecker {
    private Checker checker;

    public EpubCheckChecker() {
    }

    public void setChecker(Checker checker) {
        this.checker = checker;
    }

    @Deprecated
    public int processEpubFile(String[] args) {
        // Implementation
    }

    public int validateFile(String path, EPUBVersion version, Report report, EPUBProfile profile) {
        return checker.validate(path, version, report, profile);
    }
}

class EpubCheckCheckerImpl {
    private final Checker checker;

    public EpubCheckCheckerImpl(Checker checker, EPUBProfile profile) {
        this.checker = checker;
    }

    @Override
    public int validateFile(String path, EPUBVersion version, Report report, EPUBProfile profile) {
        // Implementation
    }
}

class EpubResourceProvider extends GenericResourceProvider {
    private final File file;

    public EpubResourceProvider(File file) {
        this.file = file;
    }

    @Override
    protected Resource[] getResources() throws InvalidVersionException {
        return new Resource[]{file};
    }

}