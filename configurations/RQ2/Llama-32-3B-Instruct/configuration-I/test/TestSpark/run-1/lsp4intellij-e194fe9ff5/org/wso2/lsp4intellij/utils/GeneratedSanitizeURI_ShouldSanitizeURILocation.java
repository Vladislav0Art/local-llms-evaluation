package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.wso2.lsp4intellij.utils.FileUtils;
import org.wso2.lsp4intellij.utils.ProjectUtil;
import org.wso2.lsp4intellij.utils.VirtualFileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Set;
import java.util.stream.Collectors;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSanitizeURI_ShouldSanitizeURILocation {

    private FileUtils fileUtils = new FileUtils();

    @Test
    public void sanitizeURI_ShouldSanitizeURILocation() {
        String uri = "file:////localhost:/home/user/file.txt";
        assertEquals("file://localhost/home/user/file.txt", fileUtils.sanitizeURI(uri));
    }
}

class Project {
}

}