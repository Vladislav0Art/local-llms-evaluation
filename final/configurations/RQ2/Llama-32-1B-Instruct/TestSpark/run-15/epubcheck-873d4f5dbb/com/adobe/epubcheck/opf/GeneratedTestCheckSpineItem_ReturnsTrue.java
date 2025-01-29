package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestCheckSpineItem_ReturnsTrue {

    private OpfChecker30 checker;

    @BeforeEach
    public void setup() {
        this.checker = new OPFChecker30(ValidationContext.createDefault());
    }

    @Test
    public void testCheckSpineItem_ReturnsTrue() {
        when(item.getUri()).thenReturn("https://example.com/path");
        doReturn(true).when(opfHandler).handleResource();
        OpfItem item = new OPFItem();
        checker.checkSpineItem(item, opfHandler);
        assertThat(item.isUriValid(), isTrue);
    }

}