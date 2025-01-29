package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetLocale {

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
    public void testGetLocale() {
        Locale expectedLocale = "en";
        assertEquals(expectedLocale, EpubChecker.getLocale());
    }

}