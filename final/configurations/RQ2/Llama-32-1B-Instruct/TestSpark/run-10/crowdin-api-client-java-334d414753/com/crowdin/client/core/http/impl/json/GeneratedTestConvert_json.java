package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class GeneratedTestConvert_json {

    @Mock
    private ObjectMapper objectMapper;

    @Mock
    private SimpleDateFormat simpleDateFormat;

    @Test
    public void testConvert_json() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.convertValue(anyObject(), anyClass())).thenReturn("test");
        String json = "test";
        T result = transformer.convert(json);
        verify(objectMapper).convertValue(eq(json), eq(AnyClass.class));
        assertSame("test", result);
    }

}