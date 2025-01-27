package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvert_noProperties {

    @Mock
    private ObjectMapper mapper;

    @Mock
    private SimpleModule module;

    @Test
    public void convert_noProperties() {
        when(mapper.findAndRegisterModules()).thenReturn(module);
        Class<Project> clazz = Project.class;
        try {
            JacksonJsonTransformer.convert(null);
            assert false;
        } catch (NullPointerException e) {
            // Expected
        }
    }

}