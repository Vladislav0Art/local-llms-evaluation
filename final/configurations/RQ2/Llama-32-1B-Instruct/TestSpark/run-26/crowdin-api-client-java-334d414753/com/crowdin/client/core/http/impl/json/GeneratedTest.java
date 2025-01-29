package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTest {

    @BeforeAll
    public static void setUpClass() {
        // Remove mocking for now, leave it as is
    }

    @BeforeEach
    public void setup() throws Exception {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testParseJson() throws Exception {
        String json = "{\"name\":\"John\",\"age\":30}";
        Project project = objectMapper.readValue(json, Project.class);
        System.out.println(project.getName());
    }

    @Test
    public void testConvertStringToObject() throws Exception {
        String string = "\"Hello, World!\"";
        LanguageTranslations translations = (LanguageTranslations) objectMapper.readValue(string, LanguageTranslations.class);
        System.out.println(translations);
    }
}

class Project {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                '}';
    }
}

class LanguageTranslations {

    private List<Translation> translations;

    public List<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }

    @Override
    public String toString() {
        return "LanguageTranslations{" +
                "translations=" + translations +
                '}';
    }
}

class Translation {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "text='" + text + '\'' +
                '}';
    }
}

public class JsonTransformer implements ObjectMapper {

    @Override
    public String valueToSerializer(Object value) throws JsonProcessingException {
        if (value instanceof String) {
            return ((String) value).replace("\"", "");
        } else if (value instanceof List) {
            return "[" + String.join(", ", (List<?>) value) + "]";
        } else {
            return value.toString();
        }
    }

    @Override
    public void close(WriteableContext context, Object value, Type typeOfTarget) throws JsonProcessingException {
        System.out.println(value);
    }

    @Override
    public boolean writeValue(WriteableContext context, Object value, Type typeOfTarget) throws JsonProcessingException {
        return true;
    }
}

public class SneakyThrowsTest {

    @BeforeAll
    public static void setUpClass() {
        // Remove mocking for now, leave it as is
    }

    @BeforeEach
    public void setup() throws Exception {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testSneakyThrows() throws JsonProcessingException {
        String json = "{\"name\":\"John\",\"age\":30}";
        objectMapper.writeValue(new File("output.json"), json);
    }

}