package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedTestGetCrowdinApiName {

    @Mock
    private CrowdinApiCrowdin crowdin;

    @Mock
    private LanguageTranslations languageTranslations;

    @InjectMocks
    private CrowdinApiTransformer transformer;

    @Test
    public void testGetCrowdinApiName() {
        String crowdinApiName = transformer.getCrowdinApiName();
        assertNotNull(crowdinApiName);
    }
}

class CrowdinApiException extends RuntimeException {
}

public class CrowdinApiCrowdin {
    private LanguageTranslations languageTranslations;

    public LanguageTranslations getCrowdin() {
        return languageTranslations;
    }

    public void setCrowdin(LanguageTranslations languageTranslations) {
        this.languageTranslations = languageTranslations;
    }
}

public class LanguageTranslations {
}

public class CrowdinApiTransformer {
    public String getCrowdinApiName() {
        return "crowdin-api-name";
    }

    public CrowdinApiException convert(LanguageTranslations languageTranslations) {
        // implementation
    }

}