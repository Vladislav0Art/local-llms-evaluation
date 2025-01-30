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

public class GeneratedConvertNullTest {

    @Test
    public void convertNullTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String result = jacksonJsonTransformer.convert(null);
        Assert.assertEquals("null", result);
    }

}