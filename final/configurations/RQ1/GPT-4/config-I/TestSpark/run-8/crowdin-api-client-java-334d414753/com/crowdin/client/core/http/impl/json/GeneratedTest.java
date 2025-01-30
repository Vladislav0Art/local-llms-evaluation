package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertTest() {
        Project project = new Project();
        String result = jacksonJsonTransformer.convert(project);
        assertTrue(result.matches("\\{\\s*\\}")); // A simple check that resulting string looks like an empty JSON object.
    }

    private String loadJsonFromFile(String fileName) {
        try (InputStream inputStream = getClass().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Cannot find " + fileName);
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                return reader.lines().collect(Collectors.joining("\n"));
            }
        } catch (IOException ex) {
            throw new RuntimeException("Could not load JSON", ex);
        }
    }

    @Test
    public void convertProjectScenarioTest() {
        Project project = new Project();
        String result = jacksonJsonTransformer.convert(project);
        assertNotNull(result);
    }

    private String loadJsonFromFile(String fileName) {
        try (InputStream inputStream = getClass().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Cannot find " + fileName);
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                return reader.lines().collect(Collectors.joining("\n"));
            }
        } catch (IOException ex) {
            throw new RuntimeException("Could not load JSON", ex);
        }
    }

}