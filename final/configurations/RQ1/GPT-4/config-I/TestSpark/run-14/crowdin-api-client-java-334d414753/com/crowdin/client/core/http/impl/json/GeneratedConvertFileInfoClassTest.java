package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertFileInfoClassTest {

    @Test
    public void convertFileInfoClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(1L);
        fileInfo.setName("Test File");
        String json = transformer.convert(fileInfo);
        assertNotNull(json);
    }

}