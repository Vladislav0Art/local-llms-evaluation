package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseHttpExceptionTest {

    @Test
    public void parseHttpExceptionTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HttpException expected = new HttpException("Test message", 404);
        HttpException actual = transformer.parse("{\"message\":\"Test message\", \"code\":404}", HttpException.class);
        assertEquals(expected.getMessage(), actual.getMessage());
    }

}