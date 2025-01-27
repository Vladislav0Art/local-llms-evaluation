package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIgnoreHttpErrorsSetsIgnoreHttpErrorsOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void ignoreHttpErrorsSetsIgnoreHttpErrorsOnConnection() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assert connection.isIgnoreHttpErrors() == ignoreHttpErrors;
    }

}