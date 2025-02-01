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

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"invalid\":\"json\"}";
        transformer.parse(json, HttpException.class);
    }

}