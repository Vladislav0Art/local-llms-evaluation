package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.HttpBackend;
import com.crowdin.client.core.http.HttpHeaders;
import com.crowdin.client.core.http.HttpMethod;
import com.crowdin.client.core.http.HttpRequest;
import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.SneakyThrows;

public class GeneratedTestConvertJson {

    @Override
    public Project parse(String json, Class<Project> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        return (Project) mapper.readValue(json, clazz);
    }

    @Override
    public String convert(Project obj) {
        HttpHeaders headers = (HttpHeaders) obj.getHeaders();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String date = formatter.format(new Date(obj.getCreatedOn()));
        return mapper.writeValueAsString(obj);
    }

    @Override
    public Project parse(String json, Class<HttpRequest> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        return (Project) mapper.readValue(json, clazz);
    }

    @Override
    public String convert(HttpRequest obj) {
        HttpHeaders headers = (HttpHeaders) obj.getHeaders();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String date = formatter.format(new Date(obj.getCreatedOn()));
        return mapper.writeValueAsString(obj);
    }

    @Test
    public void testConvertJson() {
        JacksonJsonTransformerImpl transformer = new JacksonJsonTransformerImpl();
        Project project = transformer.convert(new Project());
        assertEquals("{\"created_at\":\"2022-01-01T00:00:00.000Z\"}", project.toString());
    }

}