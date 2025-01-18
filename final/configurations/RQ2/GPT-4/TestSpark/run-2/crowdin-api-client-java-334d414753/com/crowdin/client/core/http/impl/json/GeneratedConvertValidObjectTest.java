package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(Long.valueOf(5));
        project.setName("test");

        String json = transformer.convert(project);

        Assert.assertTrue(json.contains("\"id\":5"));
        Assert.assertTrue(json.contains("\"name\":\"test\""));
    }

}