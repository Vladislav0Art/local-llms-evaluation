package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParse_InvalidJsonTest {

    @Mock
    private Project project;

    @Mock
    private LanguageTranslations languageTranslations;

    @Mock
    private ExportOptions exportOptions;

    @Mock
    private ImportOptions importOptions;

    @Mock
    private ObjectMapper objectMapper;

    private JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parse_InvalidJsonTest() {
        String json = "{\"name\":\"test project\",\"id\":123,\"languages\":[\"en\"]}";
        assertThrows(CrowdinApiException.class, () -> jsonTransformer.parse(json, Project.class));
    }

}