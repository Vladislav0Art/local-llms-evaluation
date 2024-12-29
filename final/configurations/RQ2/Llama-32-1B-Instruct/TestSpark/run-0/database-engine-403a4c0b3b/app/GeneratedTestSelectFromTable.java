package app;

public class GeneratedTestSelectFromTable {

    private Validator validator;

    @Before
    public void initValidator() {
        validator = new Validator();
    }

    @Test
    public void testSelectFromTable() throws DBAppException {
        CSVReader reader = new CSVReader();
        String[] fields = {"id", "name"};
        reader.read(fields);
        getReader().close();

        Iterator<String[]> iterator = getReader().iterator();
        while (iterator.hasNext()) {
            String[] values = iterator.next();
            try {
                selectFromTable(values[0], values[1]);
            } catch (DBAppException e) {
                throw new RuntimeException(e);
            }
        }

        // check results
    }

    private HashSet<String> getMyTables() throws DBAppException {
        return validator.toString();
    }

    private void insertIntoTable(String id, String name) throws DBAppException {
        CSVWriter writer = new CSVWriter();
        writer.write(id);
        writer.write(name);

        try {
            initTable(writer, null, null, null, null);
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateTable(String id, String name) throws DBAppException {
        CSVReader reader = new CSVReader();
        String[] fields = {"id", "name"};
        reader.read(fields);
        CSVWriter writer = new CSVWriter();

        // update data in table
        try {
            initTable(writer, reader, null, null, null);
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }

        Iterator<String[]> iterator = getReader().iterator();
        while (iterator.hasNext()) {
            String[] values = iterator.next();
            try {
                updateTable(values[0], values[1]);
            } catch (DBAppException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void selectFromTable(String id, String name) throws DBAppException {
        CSVReader reader = new CSVReader();
        String[] fields = {"id", "name"};
        reader.read(fields);

        try {
            Iterator<String[]> iterator = getReader().iterator();
            while (iterator.hasNext()) {
                String[] values = iterator.next();
                if (values[0].equals(id) && values[1].equals(name)) {
                    return;
                }
            }

            throw new RuntimeException("No data found");
        } catch (DBAppException e) {
            throw new RuntimeException(e);
        }
    }
}

class CSVReaderTest {

    @Before
    public void initCSVReader() {
        CSVReader reader = new CSVReader();
        // set up reader with test data
    }

}