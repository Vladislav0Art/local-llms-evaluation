package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import java.io.IOException;
import java.text.SimpleDateFormat;

@RunWith(org.junit4.JUnit4ClassRunner.class)
public class GeneratedConvertObjectToStringWithSimpleDateFormatTest {

    @Mock
    private ObjectMapper objectMapper;

    @Mock
    private LanguageTranslations languageTranslations;

    public JacksonJsonTransformerTest() {
        MockitoAnnotations.initMocks(this);
        PowerMockito.addProperties(new SimpleClass(), AnnotatedBuilder.class);
    }

    @Test
    public void convertObjectToStringWithSimpleDateFormatTest() throws IOException {
        Project project = new Project("my-project", "This is my project");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String formattedDate = simpleDateFormat.format(System.currentTimeMillis());
        JacksonJsonTransformer.convert(project, simpleDateFormat);

        // Assert
        org.junit.Assert.assertEquals("{\"name\":\"my-project\",\"description\":\"This is my project\"}", JacksonJsonTransformer.convert(project));
    }

}