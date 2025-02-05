package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedBuildWithDirectiveAnnotationTest {

    @Test
    public void buildWithDirectiveAnnotationTest() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        // Simulate an annotation GraphQLDirectives on our mocked field
        Mockito.when(field.getAnnotations())
                .thenReturn(new Annotation[]{Mockito.mock(GraphQLDirectives.class)});

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);

        GraphQLDirective[] directives = directivesBuilder.build();

        assertEquals(1, directives.length);
    }

}