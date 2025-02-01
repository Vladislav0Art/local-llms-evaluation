package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConvertTest {

    @Test
    public void convertTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("test");
        String jsonString = transformer.convert(project);
        assertTrue(jsonString.contains("\"name\":\"test\""));
    }

}