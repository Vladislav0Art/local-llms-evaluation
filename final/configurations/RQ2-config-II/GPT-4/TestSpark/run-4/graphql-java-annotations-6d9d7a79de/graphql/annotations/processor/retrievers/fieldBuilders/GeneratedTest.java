package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void buildNoDirectiveAnnotationTest() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);

        GraphQLDirective[] directives = directivesBuilder.build();

        assertEquals(0, directives.length);
    }

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

    @Test
    public void buildInvalidDirectiveAnnotationTest() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        // Simulate an invalid annotation on our mocked field
        Mockito.when(field.getAnnotations())
                .thenReturn(new Annotation[]{Mockito.mock(Annotation.class)});

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        try {
            GraphQLDirective[] directives = directivesBuilder.build();
            fail("Expected exception was not thrown");
        } catch (GraphQLAnnotationsException ex) {
            assertEquals("Unable to generate directives for the field", ex.getMessage());
        }
    }

}