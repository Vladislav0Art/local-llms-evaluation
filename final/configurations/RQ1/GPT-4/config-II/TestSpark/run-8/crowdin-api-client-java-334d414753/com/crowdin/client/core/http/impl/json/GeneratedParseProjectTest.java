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

public class GeneratedParseProjectTest {

    @Test
    public void parseProjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project expected = new Project();
        expected.setName("Test project");
        Project actual = transformer.parse("{\"name\":\"Test project\"}", Project.class);
        assertEquals(expected.getName(), actual.getName());
    }

}