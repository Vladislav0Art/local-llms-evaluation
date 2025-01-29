package com.adobe.epubcheck.tool;

public class GeneratedValidateEpubFileTest {

    @Test
    public void validateEpubFileTest() {
        String[] args = {};
        EpubChecker checker = new EpubChecker();
        // test: "validateEpubFile"
        checkEpubFile(checker, args);
    }

    private void checkEpubFile(EpubChecker checker, String[] args) {
        String path = "path_to_ftp_file";
        EPUBVersion version = new EPUBVersion("3.0");
        Report report = new DefaultReportImpl();
        EpubCheckFactory factory = new EpubCheckFactory();
        EpubCheck check = factory.create(checker.getLocale());
        ValidationContextBuilder validationContextBuilder = new ValidationContextBuilder().setPath(path);
        check.addValidationContext(validationContextBuilder.build());
        CheckerReport checkerReport = new CheckerReport();
        checker.validateEpubFile(path, version, checkerReport, factory);
    }

}