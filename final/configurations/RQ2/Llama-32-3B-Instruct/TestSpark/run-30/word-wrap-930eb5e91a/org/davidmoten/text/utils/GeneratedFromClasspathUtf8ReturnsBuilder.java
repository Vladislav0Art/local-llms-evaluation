package org.davidmoten.text.utils;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class GeneratedFromClasspathUtf8ReturnsBuilder {

    @Test
    public void fromClasspathUtf8ReturnsBuilder() {
        // given
        String resource = "test resource";

        // when
        Builder builder = WordWrap.fromClasspathUtf8(resource);

        // then
        assertThat(builder, is(notNullValue()));
    }

}