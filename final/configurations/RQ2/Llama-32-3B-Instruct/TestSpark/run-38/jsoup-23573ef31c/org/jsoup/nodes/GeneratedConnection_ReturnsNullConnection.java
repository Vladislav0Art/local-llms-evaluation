package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedConnection_ReturnsNullConnection {

    @Test
    public void connection_ReturnsNullConnection() {
        Document document = new Document("");
        assertNull(document.connection());
    }

}