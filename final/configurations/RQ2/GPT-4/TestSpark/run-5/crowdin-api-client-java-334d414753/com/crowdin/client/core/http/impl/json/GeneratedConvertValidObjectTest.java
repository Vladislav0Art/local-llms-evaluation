package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjectTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertValidObjectTest() {
        Project project = new Project();
        project.setId(Long.valueOf(1));
        project.setName("Project");
        String json = transformer.convert(project);
        Assert.assertEquals("{\"id\":1,\"name\":\"Project\"}", json);
    }

}