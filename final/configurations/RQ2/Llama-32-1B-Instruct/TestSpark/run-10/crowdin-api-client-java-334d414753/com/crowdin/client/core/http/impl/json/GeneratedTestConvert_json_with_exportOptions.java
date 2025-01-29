package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class GeneratedTestConvert_json_with_exportOptions {

    @Mock
    private ObjectMapper objectMapper;

    @Mock
    private SimpleDateFormat simpleDateFormat;

    @Test
    public void testConvert_json_with_exportOptions() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.getFactoryBean().getBean(ExportOptions.class, ExportOptions.class)).thenReturn(new SimpleModule());
        ExportOptions exportOptions = new ExportOptions();
        when(languageTranslations.getTranslationFor(anyString())).thenReturn("test");
        String json = "test";
        T result = transformer.convert(json);
        verify(objectMapper).convertValue(eq(json), eq(ExportOptions.class));
        assertSame("test", result);
    }

}