package app;

public class GeneratedTest {

    private String tableName;

    public SQLGenerator(String tableName) {
        this.tableName = tableName;
    }

    public String insertIntoTable(Object[] arrData, String... fields) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(fields[i]);
        }
        return "INSERT INTO " + tableName + " (" + sb.toString() + ") VALUES (" + arrDataToString(arrData, fields.length) + ")";
    }

    public String updateTable(String condition, Object value, String... fields) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(fields[i]);
        }
        return "UPDATE " + tableName + " SET " + sb.toString() + " WHERE " + condition + " = '" + valueToString(value) + "'";
    }

    public String deleteFromTable(String... conditions) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < conditions.length; i++) {
            if (i > 0) sb.append(" AND ");
            sb.append(conditions[i]);
        }
        return "DELETE FROM " + tableName + " WHERE " + sb.toString() + ";";
    }

    private String arrDataToString(Object[] arrData, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i > 0) sb.append(", ");
            sb.append("'").append(arrData[i]).append("'");
        }
        return sb.toString();
    }

    private String valueToString(Object value) {
        if (value instanceof Object[]) {
            return " '" + ((Object[]) value)[0] + "'";
        } else {
            return "'" + value + "'";
        }
    }
}

public class SQLQueryGeneratorTest {

}