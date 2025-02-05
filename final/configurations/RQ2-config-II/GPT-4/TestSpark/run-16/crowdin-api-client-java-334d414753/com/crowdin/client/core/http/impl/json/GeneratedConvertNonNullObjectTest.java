package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertNonNullObjectTest {

    @Test
    public void convertNonNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(1L);
        fileInfo.setName("file");

        String result = transformer.convert(fileInfo);

        assertNotNull(result);
        assertTrue(result.contains("\"id\":1"));
        assertTrue(result.contains("\"name\":\"file\""));
    }

}