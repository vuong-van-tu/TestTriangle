public class TriangleClassifier {
    int a, b;
    double c;

    public String kiemTraTamGiac(int a, int b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b || a == c || b == c) {
                return "Là tam giác cân ";
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                return "Là tam giác vuông ";
            } else if (a == b && b == c && a == c) {
                return "Là tam giác đều";
            } else {
                return "Là tam giác thường ";
            }
        }
        return "Không phải là tam giác!";
    }

}
