package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertInvalidObjectTest {


    private static JacksonJsonTransformer jsonTransformer;

    @BeforeClass
    public static void setUp() {
        jsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void convertInvalidObjectTest() throws JsonProcessingException {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setExportOptions(null);
        jsonTransformer.convert(fileInfo);
    }

}