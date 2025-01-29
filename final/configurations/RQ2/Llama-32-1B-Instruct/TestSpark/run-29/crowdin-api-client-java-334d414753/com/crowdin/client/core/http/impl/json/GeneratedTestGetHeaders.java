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

public class GeneratedTestGetHeaders {

    public static Map<String, Object> parseJson(String json) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayInputStream(json.getBytes());
        ObjectInputStream ois = new ObjectInputStream(bos);
        return (Map<String, Object>) ois.readObject();
    }

    @Test
    public void testGetHeaders() throws Exception {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        HttpHeaders headersResponse = getHeaders(headers);
        assertEquals("application/json", headersResponse.get("Content-Type"));
    }

    private HttpResponse sendRequest(Project project, String method, String json) throws IOException {
        Map<String, Object> data = new HashMap<>();
        if (method.equals("POST")) {
            data.put("body", json);
        }
        return sendRequest(project, method, data);
    }

    public static HttpRequest sendRequest(Project project, String method, Map<String, Object> data) throws IOException {
        if (data == null || data.isEmpty()) {
            throw new NullPointerException("Data cannot be null or empty");
        }
        if (method.equals("POST")) {
            return new HttpRequest(project, data);
        } else {
            throw new UnsupportedOperationException("Unsupported HTTP method: " + method);
        }
    }

    public static HttpHeaders getHeaders(Map<String, String> headers) throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/test-data.json");
        if (inputStream != null) {
            InputStreamReader reader = new InputStreamReader(inputStream);
            StringBuilder sb = new StringBuilder();
            byte[] buffer = new byte[1024];
            while ((buffer.length == 0 && !sb.isEmpty()) || inputRead(buffer)) {
                sb.append((char) buffer[0]);
                for (int i = 1; i < buffer.length; i++) {
                    if (Character.isWhitespace(buffer[i])) {
                        break;
                    } else {
                        sb.append((char) buffer[i]);
                    }
                }
            }
            return new HttpHeaders(sb.toString());
        } else {
            return new HttpHeaders();
        }
    }

    private static boolean inputRead(byte[] data) {
        while (!data.length == 0 && !Character.isWhitespace(data[data.length - 1])) {
            // ignore empty line
            data = Arrays.copyOf(data, data.length - 1);
        }
        return data.length > 0;
    }

}