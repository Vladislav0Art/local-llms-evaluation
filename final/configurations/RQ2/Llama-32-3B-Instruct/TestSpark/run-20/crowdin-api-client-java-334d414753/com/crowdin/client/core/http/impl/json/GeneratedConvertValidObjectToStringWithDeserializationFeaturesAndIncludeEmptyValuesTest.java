package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertValidObjectToStringWithDeserializationFeaturesAndIncludeEmptyValuesTest {

    @Mock
    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void convertValidObjectToStringWithDeserializationFeaturesAndIncludeEmptyValuesTest() {
        Project project = new Project("Test", 1, "en");
        Class<?> clazz = Project.class;
        when(objectMapper.configure(MapperFeature DeserializationFeature, true)).thenReturn(true);
        String result = new JacksonJsonTransformer().convert(project, new IncludeNullValues());
        assertThat(result, is("{\"name\":\"Test\",\"id\":1,\"language\":\"en\"}"));
    }

    @Before
    public void configureDeserializationFeatureTest() {
        when(objectMapper.configure(MapperFeature DeserializationFeature, true)).thenReturn(true);
    }
}

}