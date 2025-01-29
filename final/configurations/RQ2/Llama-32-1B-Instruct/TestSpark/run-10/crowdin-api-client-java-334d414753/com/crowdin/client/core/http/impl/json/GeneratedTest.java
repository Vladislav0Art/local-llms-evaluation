package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Mock
    private ObjectMapper objectMapper;

    @Mock
    private SimpleDateFormat simpleDateFormat;

    @Test
    public void testParse_json() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyClass.class)).thenReturn("test");
        String json = "test";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyClass.class));
        assertSame("test", result);
    }

    @Test
    public void testConvert_json() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.convertValue(anyObject(), anyClass())).thenReturn("test");
        String json = "test";
        T result = transformer.convert(json);
        verify(objectMapper).convertValue(eq(json), eq(AnyClass.class));
        assertSame("test", result);
    }

    @Test
    public void testConvert_json_with_language() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.getFactoryBean().getBean(AnyClass.class, AnyClass.class)).thenReturn(new SimpleModule());
        LanguageTranslations languageTranslations = new LanguageTranslations("en");
        when(languageTranslations.getTranslationFor(anyString())).thenReturn("test");
        String json = "test";
        T result = transformer.convert(json);
        verify(objectMapper).convertValue(eq(json), eq(AnyClass.class));
        assertSame("test", result);
    }

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

    @Test
    public void testConvert_json_with_importOptions() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.getFactoryBean().getBean(ImportOptions.class, ImportOptions.class)).thenReturn(new SimpleModule());
        ImportOptions importOptions = new ImportOptions();
        when(languageTranslations.getTranslationFor(anyString())).thenReturn("test");
        String json = "test";
        T result = transformer.convert(json);
        verify(objectMapper).convertValue(eq(json), eq(ImportOptions.class));
        assertSame("test", result);
    }

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

    @Test
    public void testParse_json_null() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyClass.class)).thenReturn(null);
        String json = "null";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyClass.class));
        assertSame(null, result);
    }

    @Test
    public void testParse_json_empty() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyClass.class)).thenReturn("");
        String json = "";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyClass.class));
        assertSame("", result);
    }

    @Test
    public void testParse_json_emptyArray() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyArray.class)).thenReturn(new Object[]{});
        String json = "[object]";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyArray.class));
        assertSame(Arrays.asList(result), result);
    }

    @Test
    public void testParse_json_nonString() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyObject(), AnyClass.class)).thenReturn("null");
        String json = "null";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyClass.class));
        assertSame("null", result);
    }

    @Test
    public void testParse_json_null() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyClass.class)).thenReturn(null);
        String json = "null";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyClass.class));
        assertSame(null, result);
    }

    @Test
    public void testParse_json_emptyArray() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyArray.class)).thenReturn(new Object[]{});
        String json = "[object]";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyArray.class));
        assertSame(Arrays.asList(result), result);
    }

    @Test
    public void testParse_json_object() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyClass.class)).thenReturn(new Object() {
        }.getClass());
        String json = "{\"projectId\":1,\"name\":\"test\"}";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyClass.class));
        assertSame(result, transformObjectToProject(result));
    }

    @Test
    public void testParse_json_object_with_null() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyClass.class)).thenReturn(null);
        String json = "{\"projectId\":1,\"name\":\"test\"}";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyClass.class));
        assertSame(null, result);
    }

    @Test
    public void testParse_json_object_array() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyArray.class)).thenReturn(new Object[]{"", "test"}`);
        String json = "[\"object\", \"test\"]";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyArray.class));
        assertSame(Arrays.asList(transformObjectToProject(result)), result);
    }

    @Test
    public void testParse_json_object_array_with_null() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyArray.class)).thenReturn(new Object[]{null, "test"});
        String json = "[\"object\", \"test\"]";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyArray.class));
        assertSame(Arrays.asList(transformObjectToProject(result)), result);
    }

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

    @Test
    public void testParse_json_object_array_object_with_null() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyArray.class)).thenReturn(new Object[]{new Object() {
        }.getClass(), null});
        String json = "{\"projectId\":1,\"name\":\"test\"}";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyArray.class));
        assertSame(Arrays.asList(transformObjectToProject(result)), result);
    }

    @Test
    public void testParse_json_object_array_null() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        when(objectMapper.readValue(anyString(), AnyArray.class)).thenReturn(new Object[]{null, null});
        String json = "[\"object\", \"test\"]";
        T result = transformer.parse(json, Project.class);
        verify(objectMapper).readValue(eq(json), eq(AnyArray.class));
        assertSame(Arrays.asList(null), result);
    }

    private <T> T transformObjectToProject(T object) {
        if (object == null) return null;
        try {
            if (object instanceof Object[])
                return Arrays.stream((Object[]) object).map(Object::toString).collect(Collectors.toList());
            else return (T) object.toString();
        } catch (Exception e) {
            return object;
        }
    }

}