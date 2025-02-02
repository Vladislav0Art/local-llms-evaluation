package org.jsoup.nodes;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        Connection connection = new Connection();
        Document document = new Document().connection(connection);
        assertNotNull(document.connection());
    }
}

public class Document {

    private Connection connection;

    public Document connection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public boolean hasConnection() {
        return connection != null;
    }
}

public class QuirksMode {

    private Object quirksmode;

    public Object quirksmode(LimitedQuirks limitedQuirks) {
        this.quirksmode = limitedQuirks;
        return this.quirksmode;
    }

    public boolean hasQuirksMode() {
        return quirksmode != null;
    }
}

public class LimitedQuirks {

}

public class Parser {
}

}