package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertObjectToJsonTest {

    @Test
    public void convertObjectToJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("test");
        project.setId(1);
        String json = transformer.convert(project);
        Assert.assertEquals("{\"name\":\"test\", \"id\":1}", json);
    }

}