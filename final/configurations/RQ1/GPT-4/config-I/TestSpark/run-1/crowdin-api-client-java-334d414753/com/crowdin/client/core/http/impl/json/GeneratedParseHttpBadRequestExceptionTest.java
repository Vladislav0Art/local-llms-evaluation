package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedParseHttpBadRequestExceptionTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpBadRequestExceptionTest() throws Exception {
        HttpBadRequestException exception = mock(HttpBadRequestException.class);
        String json = transformer.convert(exception);
        HttpBadRequestException result = transformer.parse(json, HttpBadRequestException.class);
        assertEquals(exception.getClass(), result.getClass());
    }

}