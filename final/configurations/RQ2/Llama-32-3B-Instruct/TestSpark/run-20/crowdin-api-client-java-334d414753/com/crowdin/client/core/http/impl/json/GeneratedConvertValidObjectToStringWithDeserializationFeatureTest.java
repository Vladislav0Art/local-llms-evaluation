package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertValidObjectToStringWithDeserializationFeatureTest {

    @Mock
    private ObjectMapper objectMapper;

    @Test
    public void convertValidObjectToStringWithDeserializationFeatureTest() {
        Project project = new Project("Test", 1, "en");
        Class<?> clazz = Project.class;
        when(objectMapper.configure(MapperFeature DesmonderializationFeature, Mockito.anyBoolean())).thenReturn(true);
        String result = new JacksonJsonTransformer().convert(project);
        assertThat(result, is("{\"name\":\"Test\",\"id\":1,\"language\":\"en\"}"));
    }

}