package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class GeneratedTestParse_json_object_array_object {

    @Mock
    private ObjectMapper objectMapper;

    @Mock
    private SimpleDateFormat simpleDateFormat;

    @Test
    public void testParse_json_object_array_object() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyArray.class)).thenReturn(new Object[]{new Object() {
        }.getClass()});
        String json = "{\"projectId\":1,\"name\":\"test\"}";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyArray.class));
        assertSame(transformObjectToProject(result), result);
    }

}