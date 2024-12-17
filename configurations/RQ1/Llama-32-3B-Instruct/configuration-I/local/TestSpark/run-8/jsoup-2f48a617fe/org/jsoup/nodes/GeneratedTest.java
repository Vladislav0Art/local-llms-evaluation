package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTest {

    private Appendable accum = new StringBuilder();

    public Comment() {
    }

    public void append(String data) throws IOException {
        doThrow(new IOException()).when(accum).append(any());
        accum.append(data);
    }

    public String getData() {
        return accum.toString();
    }

}