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

public class GeneratedConvertObjectToJSONTest {

    @Test
    public void convertObjectToJSONTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Test project");
        map.put("id", "1001");
        String actual = transformer.convert(map);
        String expected = "{\"name\":\"Test project\",\"id\":\"1001\"}";
        Assert.assertEquals(expected, actual);
    }

}