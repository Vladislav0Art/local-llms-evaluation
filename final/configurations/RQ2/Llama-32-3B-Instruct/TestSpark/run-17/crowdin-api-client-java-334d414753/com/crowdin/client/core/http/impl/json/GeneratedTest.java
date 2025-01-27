package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GeneratedTest {


}

package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import java.util.Optional;

public class GeneratedTest {

    @Test
    public void testCrowdin() {
        String json = "{\"name\": \"test-project\"}";
        Project project = JacksonJsonTransformer.parse(json, Project.class);
        assert project.getName().equals("test-project");
    }

    public static class Project {
        private String name;

        public String getName() {
            return name;
        }
    }

    @Test
    public void testCrowdinException() {
        String json = "{\"name\": \"test-project\"}";
        JsonNode errorsJsonNode = JacksonJsonTransformer.parse(json, JsonNode.class).get("errors");
        CrowdinApiException exception = convertToCrowdinApiException(errorsJsonNode);
        assert exception.getMessage().contains("error message");
    }

    public static CrowdinApiException convertToCrowdinApiException(JsonNode errorsJsonNode) {
        Optional<CrowdinApiException> exceptionOptional = JacksonJsonTransformer.convert(errorsJsonNode);
        return exceptionOptional.get();
    }

    public interface CrowdinJsonConverter {
        void convert(JsonNode jsonNode, Object target);
    }

    @Test
    public void testConvert() {
        LanguageTranslations translations = new LanguageTranslations();
        CrowdinJsonConverter converter = (jsonNode, obj) -> ((LanguageTranslations) obj).setLanguage(jsonNode.get("language").asText());
        converter.convert(new JsonNode.ObjectNode(), translations);
        assert translations.getLanguage().equals("en");
    }

    public static class LanguageTranslations {
        private String language;

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getLanguage() {
            return language;
        }
    }

    @Test
    public void testExportOptions() {
        ExportOptions options = new ExportOptions();
        CrowdinJsonConverter converter = (jsonNode, obj) -> ((ExportOptions) obj).setFormat(jsonNode.get("format").asText());
        converter.convert(new JsonNode.ObjectNode(), options);
        assert options.getFormat().equals("pdf");
    }

    public static class ExportOptions {
        private String format;

        public void setFormat(String format) {
            this.format = format;
        }

        public String getFormat() {
            return format;
        }
    }

}