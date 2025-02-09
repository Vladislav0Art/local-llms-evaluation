package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseEmptyJsonTest {

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "";
        try {
            Map result = transformer.parse(json, Map.class);
            fail("Expected an exception but none was thrown");
        } catch (CrowdinApiException e) {
            assertTrue(e instanceof HttpException);
        }
    }

}