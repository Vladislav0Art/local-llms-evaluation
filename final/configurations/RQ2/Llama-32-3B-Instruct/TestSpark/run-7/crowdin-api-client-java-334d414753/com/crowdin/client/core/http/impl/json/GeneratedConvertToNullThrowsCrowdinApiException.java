package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertToNullThrowsCrowdinApiException {

    @Test
    public void convertToNullThrowsCrowdinApiException() {
        LanguageTranslations translations = null;

        ObjectMapper mapper = new ObjectMapper();

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        assertThrows(CrowdinApiException.class, () -> transformer.convert(translations));
    }

}