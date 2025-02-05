package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertInvalidObjectToJsonStringTest {

    private JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertInvalidObjectToJsonStringTest() {
        FileInfo fileInfo = new FileInfo();

        jsonTransformer.convert(fileInfo);
    }

}