package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertInvalidObjectTest {

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId("abc");
        fileInfo.setName("Test File");

        transformer.convert(fileInfo);
    }

}