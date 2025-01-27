package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedMethod_MethodMethodReturnsWithMethod {

    @Test
    public void method_MethodMethodReturnsWithMethod() {
        Method method = Method.POST;
        Connection connection = HttpConnection.method(method);
        assertNotNull(connection);
    }

}