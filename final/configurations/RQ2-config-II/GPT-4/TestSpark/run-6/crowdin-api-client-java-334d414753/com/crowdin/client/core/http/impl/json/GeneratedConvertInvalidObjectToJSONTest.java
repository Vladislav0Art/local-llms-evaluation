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

public class GeneratedConvertInvalidObjectToJSONTest {

    @Test
    public void convertInvalidObjectToJSONTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(new DeserializationFeature[]{}); // Pass invalid object to convert
    }

}