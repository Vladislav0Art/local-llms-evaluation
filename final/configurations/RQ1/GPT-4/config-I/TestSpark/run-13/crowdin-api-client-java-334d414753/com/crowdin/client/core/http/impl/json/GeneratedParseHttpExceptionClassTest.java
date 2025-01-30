package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseHttpExceptionClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpExceptionClassTest() {
        String json = "{\"message\":\"exception message\"}";
        HttpException httpException = transformer.parse(json, HttpException.class);

        Assert.assertNotNull(httpException);
        Assert.assertEquals("exception message", httpException.getMessage());
    }

}