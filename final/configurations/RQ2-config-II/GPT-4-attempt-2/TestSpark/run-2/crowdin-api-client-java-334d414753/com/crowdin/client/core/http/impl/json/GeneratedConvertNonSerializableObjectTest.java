package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertNonSerializableObjectTest {

    @Test
    public void convertNonSerializableObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        NonSerializableClass nonSerializableObject = new NonSerializableClass();
        transformer.convert(nonSerializableObject);
    }

    private static class NonSerializableClass {
    }

}