package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class GeneratedTestConvert_json_with_fileInfo {

    @Mock
    private ObjectMapper objectMapper;

    @Mock
    private SimpleDateFormat simpleDateFormat;

    @Test
    public void testConvert_json_with_fileInfo() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.getFactoryBean().getBean(FileInfo.class, FileInfo.class)).thenReturn(new SimpleModule());
        FileInfo fileInfo = new FileInfo();
        fileInfo.setProjectId(1);
        when(languageTranslations.getTranslationFor(anyString())).thenReturn("test");
        String json = "test";
        T result = transformer.convert(json);
        verify(objectMapper).convertValue(eq(json), eq(FileInfo.class));
        assertSame("test", result);
    }

}