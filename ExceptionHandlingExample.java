import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Checked Exception 처리
        try {
            readFile("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        }

        // Unchecked Exception 처리
        try {
            int result = divide(10, 0);
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("산술 오류 발생: " + e.getMessage());
        }

        // finally 블록 예제
        try {
            System.out.println("try 블록 실행");
        } catch (Exception e) {
            System.out.println("catch 블록 실행");
        } finally {
            System.out.println("finally 블록 실행: 항상 실행됩니다!");
        }

        // 사용자 정의 예외 처리
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("사용자 정의 예외: " + e.getMessage());
        }

        // 멀티-catch 블록 예제
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("여러 예외 중 하나 발생: " + e.getClass().getSimpleName());
        }

        // try-with-resources 예제
        try (FileReader reader = new FileReader("nonexistent_file.txt")) {
            System.out.println("파일 읽기 성공");
        } catch (FileNotFoundException e) {
            System.out.println("try-with-resources에서 파일 오류 발생: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("기타 오류 발생: " + e.getMessage());
        }
    }

    // Checked Exception 던지기
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader reader = new FileReader(file);
    }

    // Unchecked Exception 발생시키기
    public static int divide(int a, int b) {
        return a / b; // b가 0일 경우 ArithmeticException 발생
    }

    // 사용자 정의 예외
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("나이가 18세 미만입니다.");
        }
    }
}

// 사용자 정의 예외 클래스
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}