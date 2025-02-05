package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.InvocationTargetException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedParseJsonWithUndefinedFieldTest {

    @Test
    public void parseJsonWithUndefinedFieldTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String jsonString = "{\"undefinedField\":\"Undefined\",\"id\":1001}"; // Unknown field
        transformer.parse(jsonString, Project.class);
    }

}