package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedConvertFileInfoToJsonTest {

    private static final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertFileInfoToJsonTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("TestFile");

        String result = jacksonJsonTransformer.convert(fileInfo);

        assertTrue(result.contains("\"name\":\"TestFile\""));
    }

}