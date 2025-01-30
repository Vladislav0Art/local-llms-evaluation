package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseFileInfoClassTest {

    @Test
    public void parseFileInfoClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test File\"}";
        FileInfo fileInfo = transformer.parse(json, FileInfo.class);
        assertNotNull(fileInfo);
    }

}