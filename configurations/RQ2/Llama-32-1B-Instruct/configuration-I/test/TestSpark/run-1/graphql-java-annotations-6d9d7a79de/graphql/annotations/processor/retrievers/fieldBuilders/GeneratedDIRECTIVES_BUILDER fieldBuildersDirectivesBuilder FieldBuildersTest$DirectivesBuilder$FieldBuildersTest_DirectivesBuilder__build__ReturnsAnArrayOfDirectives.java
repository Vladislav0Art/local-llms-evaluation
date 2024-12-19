package graphql.annotations.processor.retrievers.fieldBuilders;

import com.githubgraphql.annotations.processor.retrievers.FieldBuilders;
import graphql.annotations.GraphQLDirective;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeneratedDIRECTIVES_BUILDER fieldBuildersDirectivesBuilder FieldBuildersTest$DirectivesBuilder$FieldBuildersTest_DirectivesBuilder__build__ReturnsAnArrayOfDirectives {

    public interface AnnotatedElement {
        String getAnnotationName();
    }

    @Test
    public void DIRECTIVES_BUILDER

    fieldBuildersDirectivesBuilder FieldBuildersTest$DirectivesBuilder$FieldBuildersTest_DirectivesBuilder__build__ReturnsAnArrayOfDirectives() {
        // Arrange
        AnnotatedElement object = new AnnotatedElement();
        FieldBuilders fieldBuilders = new FieldBuilders();
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        GraphQLDirective[] directives = fieldBuilders.build(object, container);

        // Assert
        assertEquals(0, Arrays.stream(directives).count());
    }

}