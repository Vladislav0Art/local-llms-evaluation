package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTest {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JacksonJsonTransformerImpl transformer = new JacksonJsonTransformerImpl();

        Project project = new Project("test", "test");
        String json = "{\"name\":\"test\",\"id\":123,\"createdDate\":\"2022-01-01T00:00:00\"}";
        Assert.assertEquals(project, mapper.readValue(json, Project.class));

        FileInfo fileInfo = new FileInfo(1L, "test", new Date());
        String json = "{\"id\":123,\"name\":\"test\",\"createdDate\":\"2022-01-01T00:00:00\"}";
        Assert.assertEquals(fileInfo, mapper.readValue(json, FileInfo.class));
    }

}