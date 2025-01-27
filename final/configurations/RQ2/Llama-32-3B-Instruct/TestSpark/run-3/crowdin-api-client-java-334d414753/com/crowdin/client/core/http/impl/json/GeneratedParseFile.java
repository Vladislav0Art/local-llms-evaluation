package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.lang.reflect.Type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFile {

    @Mock
    private ObjectMapper objectMapper;

    private JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseFile() throws Exception {
        FileInfo fileInfo = new FileInfo();
        when(objectMapper.findAndRegisterModules()).thenReturn(new SimpleModule());
        when(objectMapper.readValue("{\"file_id\": \"123\", \"name\": \"test.txt\"}", FileInfo.class)).thenReturn(fileInfo);
        FileInfo result = (FileInfo) jsonTransformer.parse("{\"file_id\": \"123\", \"name\": \"test.txt\"}", FileInfo.class);
        assertThat(result.getFileId(), is("123"));
    }

}