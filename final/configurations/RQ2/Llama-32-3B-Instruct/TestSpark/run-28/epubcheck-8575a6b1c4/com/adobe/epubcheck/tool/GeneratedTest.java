package com.adobe.epubcheck.tool;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Override
    public com.adobe.epubcheck.tool.EpubChecker getEpubChecker() {
        return new com.adobe.epubcheck.tool.EpubChecker();
    }
}

public class LocalizableReportMock implements com.adobe.epubcheck.api.LocalizableReport {
    @Override
    public java.util.Locale getLocale() {
        return new java.util.Locale("en", "US");
    }

    @Override
    public java.io.ByteArrayOutputStream generate(String message) {
        return new java.io.ByteArrayOutputStream();
    }
}

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private com.adobe.epubcheck.api.EpubCheckFactory epubCheckFactory;

}