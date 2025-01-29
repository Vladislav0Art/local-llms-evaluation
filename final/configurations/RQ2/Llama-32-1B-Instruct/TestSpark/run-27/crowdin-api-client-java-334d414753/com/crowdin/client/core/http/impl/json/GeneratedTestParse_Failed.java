package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class GeneratedTestParse_Failed {

    private ObjectMapper objectMapper;

    @Test
    public void testParse_Failed() throws Exception {
        String json = "{\"name\":\"Crowdin\",\"version\":1,\"nonExistingField\":\"value\"}";
        objectMapper.readValue(json, Project.class);
        Assert.assertFalse(objectMapper.is successful());
    }
}

class ObjectMapper {

    private final ObjectMapper instance;

    public ObjectMapper() {
        this.instance = new ObjectMapper();
    }

    @Override
    public <T> T valueOf(Class<T> type) throws Exception {
        return instance.convertValue(this, type);
    }

    public void setInstance(ObjectMapper instance) {
        this.instance = instance;
    }
}

class JsonDeserializer extends ObjectMapper.Deserializer {

    private final SimpleDateFormat format;

    public JsonDeserializer() {
        this(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public void deserialize(String text, Class<?> type) throws Exception {
        if (type.equals(Project.class)) {
            Project project = new Project();
            project.setName(text);
            project.getVersion();
            return type;
        }
        super.deserialize(text, type);
    }
}

}