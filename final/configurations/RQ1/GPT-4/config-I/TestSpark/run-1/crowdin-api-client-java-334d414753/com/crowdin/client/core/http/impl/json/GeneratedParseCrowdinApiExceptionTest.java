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

public class GeneratedParseCrowdinApiExceptionTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseCrowdinApiExceptionTest() throws Exception {
        CrowdinApiException exception = mock(CrowdinApiException.class);
        String json = transformer.convert(exception);
        CrowdinApiException result = transformer.parse(json, CrowdinApiException.class);
        assertEquals(exception.getClass(), result.getClass());
    }

}