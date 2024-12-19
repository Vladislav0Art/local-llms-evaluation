package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.GraphQLDirective;
import graphql.annotations.Field;
import graphql.annotations.Immutable;
import graphql.annotations.Name;
import graphql.annotations.Query;
import graphql.annotations.TypeDescription;
import org.junit.jupiter.api.Test;
import com.githubgraphql.annotations.processor.retrievers.FieldBuilders;

import java.util.Arrays;

public class GeneratedDIRECTIVES_BUILDER_directivesBuilder FieldBuildersTest$DirectivesBuilder$FieldBuildersTest_DirectivesBuilder__ReturnsTheSpecifiedFieldsWhenNoAnnotatorsAreUsed {

    public interface AnnotatedElement {
        String getAnnotationName();
    }

    @Immutable
    @Name("FieldBuilders")
    public static class FieldBuilders {

        private Object[] fields = null;

        public Object[] getFieldNames() {
            return fields;
        }

        public void setFields(Object[] fields) {
            this.fields = fields;
        }
    }

    public interface DirectivesBuilder extends FieldBuilders {
    }

    @Test
    public void DIRECTIVES_BUILDER_directivesBuilder

    FieldBuildersTest$DirectivesBuilder$FieldBuildersTest_DirectivesBuilder__ReturnsTheSpecifiedFieldsWhenNoAnnotatorsAreUsed() {
        // Arrange
        AnnotatedElement object = new AnnotatedElement();
        DirectivesBuilder fieldBuilders = mock(DirectivesBuilder.class);
        Object[] fields = {"field1", "field2"};

        // Act
        GraphQLDirective[] directives = fieldBuilders.build(object, mock(ProcessingElementsContainer.class));

        // Assert
        assertNotNull(directives);
        assertEquals(fields.length, directives[0].getFieldNames().length);
    }

}