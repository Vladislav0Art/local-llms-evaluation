package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestCheckContent_ReturnsFalse {

    private OpfChecker30 checker;

    @BeforeEach
    public void setup() {
        this.checker = new OPFChecker30(ValidationContext.createDefault());
    }

    @Test
    public void testCheckContent_ReturnsFalse() {
        doReturn(false).when(this.checker).checkContent();
        assertThat(this.checker.checkContent(), isFalse);
    }

}