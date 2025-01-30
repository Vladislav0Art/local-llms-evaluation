package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseWithHttpBadRequestExceptionTest {

    @Test
    public void parseWithHttpBadRequestExceptionTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        try {
            jacksonJsonTransformer.parse("{\"unhandled_field\":\"mock\"}", HttpBadRequestException.class);
        } catch (JsonMappingException ex) {
            Assert.assertTrue(ex.getMessage().contains("unhandled_field"));
        }
    }

}