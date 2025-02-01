package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseValidHttpBadRequestExceptionClassTest {

    @Test
    public void parseValidHttpBadRequestExceptionClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validHttpResponseJson = "{}";
        HttpBadRequestException exception = transformer.parse(validHttpResponseJson, HttpBadRequestException.class);
        assertNotNull(exception);
    }

}