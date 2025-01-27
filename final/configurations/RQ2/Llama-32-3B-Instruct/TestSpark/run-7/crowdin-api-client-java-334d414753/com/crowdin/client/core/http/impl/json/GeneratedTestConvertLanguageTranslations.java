package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedTestConvertLanguageTranslations {

    @Mock
    private CrowdinApiCrowdin crowdin;

    @Mock
    private LanguageTranslations languageTranslations;

    @InjectMocks
    private CrowdinApiTransformer transformer;

    @Test
    public void testConvertLanguageTranslations() {
        when(crowdin.getCrowdin()).thenReturn(languageTranslations);
        assertThrows(CrowdinApiException.class, () -> transformer.convert(languageTranslations));
    }

}