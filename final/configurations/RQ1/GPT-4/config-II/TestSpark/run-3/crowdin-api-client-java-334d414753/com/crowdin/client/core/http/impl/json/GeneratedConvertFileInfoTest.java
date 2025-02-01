package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConvertFileInfoTest {

    @Test
    public void convertFileInfoTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(1L);
        fileInfo.setName("TestFile");
        String json = transformer.convert(fileInfo);
        assertTrue(json.contains("1"));
        assertTrue(json.contains("TestFile"));
    }

}