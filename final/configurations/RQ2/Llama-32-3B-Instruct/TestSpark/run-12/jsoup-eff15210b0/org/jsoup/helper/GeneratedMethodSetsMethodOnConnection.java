package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedMethodSetsMethodOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void methodSetsMethodOnConnection() {
        Method method = Method.GET;
        Connection connection = HttpConnection.method(method);
        assert connection.getMethod() == method;
    }

}