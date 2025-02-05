package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() throws CrowdinApiException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{invalid_json}";
        transformer.parse(json, Project.class);
    }

}