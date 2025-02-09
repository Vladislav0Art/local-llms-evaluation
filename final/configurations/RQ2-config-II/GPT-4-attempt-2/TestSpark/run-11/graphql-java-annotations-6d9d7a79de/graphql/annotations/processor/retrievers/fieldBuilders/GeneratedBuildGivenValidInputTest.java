package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildGivenValidInputTest {

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildGivenValidInputTest() {
        Field field = MockField.class.getDeclaredFields()[0];
        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        GraphQLDirective[] directives = builder.build();

        assertNotNull(directives);
        for (GraphQLDirective directive : directives) {
            assertNotNull(directive);
        }
    }

}