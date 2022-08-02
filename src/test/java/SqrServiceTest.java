import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.sqrmaven.services.SQRService;

import static org.junit.jupiter.api.Assertions.*;

class SqrServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "8,100,300",
            "0,11,99"})
    public void test(int expected, long initialvalue, long finalvalue) {
        SQRService service = new SQRService();

        long actual = service.counts(initialvalue, finalvalue);
        assertEquals(expected, actual);
    }
}