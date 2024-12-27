package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTest {

    public static String getDirectives() {
        return "@directive1\n@directive2";
    }

    // No content
}

public class NoElement {
    public static String getDirectives() {
        return "";
    }

    // No content
}

class DirectivesBuilder {
    private Class<?> elementClass;

    public DirectivesBuilder(Class<?> elementClass) {
        this.elementClass = elementClass;
    }

    public String build() {
        if (elementClass == null) {
            throw new NullPointerException("Elements cannot be null");
        } else if (elementClass == NoElement.class) {
            return "";
        } else {
            return Element.getDirectives();
        }
    }
}

class GeneratedTest {

}