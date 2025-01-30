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

public class GeneratedParseProjectTest {

    @Test
    public void parseProjectTest() throws IOException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        Project result = jacksonJsonTransformer.parse("{\"projectId\":1234}", Project.class);
        Assert.assertEquals(1234, result.getProjectId());
    }

}