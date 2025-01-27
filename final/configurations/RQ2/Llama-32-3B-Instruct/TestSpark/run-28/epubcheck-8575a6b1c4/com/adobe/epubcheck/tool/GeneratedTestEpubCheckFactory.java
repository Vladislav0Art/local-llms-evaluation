package com.adobe.epubcheck.tool;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestEpubCheckFactory {

    public static class EpubCheckFactoryMockImpl implements com.adobe.epubcheck.api.EpubCheckFactory {
        @Override
        public com.adobe.epubcheck.tool.EpubChecker getEpubChecker() {
            return new com.adobe.epubcheck.tool.EpubChecker();
        }
    }

    public static class LocalizableReportMockImpl implements com.adobe.epubcheck.api.LocalizableReport {
        @Override
        public java.util.Locale getLocale() {
            return new java.util.Locale("en", "US");
        }

        @Override
        public java.io.ByteArrayOutputStream generate(String message) {
            return new java.io.ByteArrayOutputStream();
        }
    }
}

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    public static class EpubCheckFactoryMock implements com.adobe.epubcheck.api.EpubCheckFactory {
        public static com.adobe.epubcheck.tool.EpubChecker getEpubChecker() {
            return new com.adobe.epubcheck.tool.EpubChecker();
        }
    }

    public static class LocalizableReportMock implements com.adobe.epubcheck.api.LocalizableReport {
        public java.util.Locale getLocale() {
            return new java.util.Locale("en", "US");
        }

        public java.io.ByteArrayOutputStream generate(String message) {
            return new java.io.ByteArrayOutputStream();
        }
    }

    @Mock
    private EpubCheckFactoryMock epubCheckFactory;

    @Test
    public void testEpubCheckFactory() {
        com.adobe.epubcheck.tool.EpubChecker checker = (com.adobe.epubcheck.tool.EpubChecker) epubCheckFactory.getEpubChecker();
        // Test the EpubChecker
    }

}