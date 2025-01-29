package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestParse {

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

    @Test
    public void testParse() {
        TestTest transformer = new TestTest();
        Project project = new Project("test", "test");
        String json = "{\"name\":\"test\",\"id\":123,\"createdDate\":\"2022-01-01T00:00:00\"}";
        Assert.assertEquals(project, transformer.parse(json, Project.class));
    }

    @SneakyThrows
    public static void testConvert() {
        TestTest transformer = new TestTest();
        Project project = new Project("test", "test");
        String json = "{\"name\":\"test\",\"id\":123,\"createdDate\":\"2022-01-01T00:00:00\"}";
        Assert.assertEquals(project, transformer.convert(json, Project.class));
    }

    @SneakyThrows
    public static void testConvertObject() {
        TestTest transformer = new TestTest();
        FileInfo fileInfo = new FileInfo(1L, "test", new Date());
        String json = "{\"id\":123,\"name\":\"test\",\"createdDate\":\"2022-01-01T00:00:00\"}";
        Assert.assertEquals(fileInfo, transformer.convert(json, FileInfo.class));
    }

    @SneakyThrows
    public static void testConvertObjectCustom() {
        TestTest transformer = new TestTest();
        ExportOptions exportOptions = new ExportOptions("test", "test");
        String json = "{\"id\":123,\"name\":\"test\",\"createdDate\":\"2022-01-01T00:00:00\"}";
        Assert.assertEquals(exportOptions, transformer.convert(json, ExportOptions.class));
    }

    @SneakyThrows
    public static void testConvertObjectNull() {
        TestTest transformer = new TestTest();
        Project project = null;
        String json = "{\"name\":\"test\",\"id\":123,\"createdDate\":\"2022-01-01T00:00:00\"}";
        Assert.assertEquals(project, transformer.convert(json, Project.class));
    }

    private static class TestTest {
        public Project parse(String json) throws Exception {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, Project.class);
        }

        @SneakyThrows
        public FileInfo convert(String json, Class<?> clazz) throws Exception {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, clazz);
        }
    }

}