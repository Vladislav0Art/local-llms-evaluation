package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private static final String TEST_PATH = "test.xml";
    private static final EPUBVersion VERSION = EPUBVersion.V2_0;
    private static final Report report = new DefaultReportImpl();
    private static final LocalizableReport localizableReport = new LocalizableReport();

    @BeforeEach
    public void setup() {
        EpubCheckFactory.setUseDebugReporting(false);
        EpubCheckFactory.setCheckValidationContextBuilder(new ValidationContextBuilder() {
            @Override
            public ValidationContext getValidationContext(EpPubChecker checker, String opfFile) throws InvalidVersionException {
                // Create a new validation context for the given opf file
                return new ValidationContext();
            }

            @Override
            public ValidationContext getValidationContext(ValidationContextBuilder builder, boolean useLocalizable) {
                // Add a feature to make localizations optional
                builder.addFeature(FeatureEnum.LOCALE_FEATURE);
                return builder.build();
            }
        });
    }

    @Test
    public void testValidateFile() throws IOException {
        File file = new File(TEST_PATH);
        if (!file.exists()) {
            file.createNewFile();
        }
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(file.getAbsolutePath(), VERSION, report, null);
        Assert.assertTrue("Validate file failed", result == 0);
    }

    @Test
    public void testProcessEpubFile() throws IOException {
        File file = new File(TEST_PATH);
        if (!file.exists()) {
            file.createNewFile();
        }
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(new String[]{"-o", TEST_PATH});
        Assert.assertTrue("Process epub file failed", result == 0);
    }

    @Test
    public void testGetLocale() {
        Locale expectedLocale = "en";
        assertEquals(expectedLocale, EpubChecker.getLocale());
    }

}