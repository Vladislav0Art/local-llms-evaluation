package app;

import org.junit.jupiter.api.Test;

public class GeneratedTestWriteToDbApp {

    @Test
    public void testWriteToDbApp() throws IOException {
        CsvWriter writer = new CsvWriter(new Serializer());
        List<Table> tables = createTables();
        for (String[] row : {"user1", "admin"}) {
            Table table = new Table();
            table.setRows(row);
            tables.add(table);
        }
        for (Table table : tables) {
            writeTableToDbApp(writer, table);
        }
    }

}