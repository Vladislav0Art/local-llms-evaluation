package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

import java.io.IOException;
import java.util.Date;

public class GeneratedConvertLanguageTranslations_InvalidObject_LanguageTranslationsTest {

    @Test
    public void convertLanguageTranslations_InvalidObject_LanguageTranslationsTest() throws IOException {
        assertThrows(CrowdinApiException.class, () -> JacksonJsonTransformer.convert(new Object()));
    }

}