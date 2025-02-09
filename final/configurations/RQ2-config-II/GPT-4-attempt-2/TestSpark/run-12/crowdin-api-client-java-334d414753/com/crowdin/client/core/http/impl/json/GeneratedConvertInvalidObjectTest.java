package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertInvalidObjectTest {

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(new Object());
    }

}