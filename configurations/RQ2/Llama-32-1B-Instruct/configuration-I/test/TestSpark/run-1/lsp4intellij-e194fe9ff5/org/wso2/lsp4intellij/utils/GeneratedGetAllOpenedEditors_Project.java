package org.wso2.lsp4intellij.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedGetAllOpenedEditors_Project {

    @Test
    public void getAllOpenedEditors_Project() {
        Project project = new Project();
        List<Editor> editors = FileUtils.getAllOpenedEditors(project);
        assertEquals(0, editors.size());
    }

}