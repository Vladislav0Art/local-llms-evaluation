package com.adobe.epubcheck.tool;

public class GeneratedTest {

    @Test
    public void validateFile_Props() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("2");
        Report report = new DefaultReportImpl();
        EpubCheck check = new EpubCheck(report, version);
        check.validate(props, null);
    }

    @Test
    public void validateFile_Props_Broken() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("2");
        Report report = new DefaultReportImpl();
        EpubCheck check = new EpubCheck(report, version);
        check.validate(props, null);
    }

    @Test
    public void validateFile_Props_EPUBProfile() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        EpubCheck check = new EpubChecker();
        check.validate(props, new EPUBProfile());
    }

    @Test
    public void validateFile_Props_EPUBProfile_Broken() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        EpubCheck check = new EpubChecker();
        check.validate(props, null);
    }

    @Test
    public void validateFile_Props_EPUBProfile_General() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        EpubCheck check = new EpubChecker();
        check.validate(props, new EPUBProfile());
    }

    @Test
    public void validateFile_Props_EPUBProfile_General_Broken() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        EpubCheck check = new EpubChecker();
        check.validate(props, null);
    }

    @Test
    public void validateFile_Props_EPUBVersion() {
        String[] props = new String[]{"-p", "1", "-v", "2"};
        Report report = new DefaultReportImpl();
        EpubCheck check = new EpubChecker();
        check.validate(props, new EPUBVersion("3"));
    }

    @Test
    public void validateFile_Props_EPUBVersion_Broken() {
        String[] props = new String[]{"-p", "1", "-v", "2"};
        Report report = new DefaultReportImpl();
        EpubCheck check = new EpubChecker();
        check.validate(props, null);
    }

    @Test
    public void validateFile_Props_ValidationContext() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        ValidationContext validationContext = new ValidationContextBuilder().build();
        EpubCheck check = new EpubChecker();
        check.validate(props, validationContext);
    }

    @Test
    public void validateFile_Props_ValidationContext_Broken() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        ValidationContext validationContext = new ValidationContextBuilder().build();
        EpubCheck check = new EpubChecker();
        check.validate(props, null);
    }

    @Test
    public void validateFile_Props_ValuationContext() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        Report report = new DefaultReportImpl();
        ValidationContext validationContext = new ValidationContextBuilder().build();
        EpubCheck check = new EpubChecker();
        check.validate(props, validationContext);
    }

    @Test
    public void validateFile_Props_ValuationContext_Broken() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        Report report = new DefaultReportImpl();
        ValidationContext validationContext = new ValidationContextBuilder().build();
        EpubCheck check = new EpubChecker();
        check.validate(props, null);
    }

}