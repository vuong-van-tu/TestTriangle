import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void kiemTraTamGiac() {
        TriangleClassifier trg = new TriangleClassifier();

        System.out.println(trg.kiemTraTamGiac(6,8,10));
    }
}