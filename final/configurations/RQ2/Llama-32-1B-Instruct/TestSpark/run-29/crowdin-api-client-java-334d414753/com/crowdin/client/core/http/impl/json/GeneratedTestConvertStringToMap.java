package com.crowdin.client.core.http.impl.json;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

import com.crowdin.client.core.http.HttpBackend;
import com.crowdin.client.core.http.HttpHeaders;
import com.crowdin.client.core.http.HttpMethod;
import com.crowdin.client.core.http.HttpRequest;
import com.crowdin.client.core.http.HttpResponse;
import com.crowdin.client.core.http.HttpStatus;

public class GeneratedTestConvertStringToMap {

    public static Map<String, Object> parseJson(String json) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayInputStream(json.getBytes());
        ObjectInputStream ois = new ObjectInputStream(bos);
        return (Map<String, Object>) ois.readObject();
    }

    @Test
    public void testConvertStringToMap() throws Exception {
        String json = "{\"id\":\"1\",\"name\":\"Name\"}";
        Map<String, Object> data = new HashMap<>();
        data.put("id", "1");
        data.put("name", "Name");
        Project project = new Project(data);
        Object expectedObject = parseJson(json);
        assertEquals(project, (Project) expectedObject);
    }

}