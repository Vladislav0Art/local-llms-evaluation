package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseHttpBadRequestExceptionTest {

    @Test
    public void parseHttpBadRequestExceptionTest() throws IOException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        HttpBadRequestException result = jacksonJsonTransformer.parse("{\"exception\":\"mock\"}", HttpBadRequestException.class);
        Assert.assertEquals("mock", result.getException());
    }

}