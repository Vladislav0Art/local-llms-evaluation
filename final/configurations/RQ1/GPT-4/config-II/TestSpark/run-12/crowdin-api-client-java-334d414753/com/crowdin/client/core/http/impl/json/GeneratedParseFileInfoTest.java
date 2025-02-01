package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseFileInfoTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseFileInfoTest() throws Exception {
        String json = "{\"name\":\"TestFile\", \"type\":\"text\"}";
        FileInfo result = jacksonJsonTransformer.parse(json, FileInfo.class);
        assertNotNull(result);
        assertEquals("TestFile", result.getName());
        assertEquals("text", result.getType());
    }

}