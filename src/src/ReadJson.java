import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            // Đọc file JSON
            Object obj = parser.parse(new FileReader("data.json"));

            // Chuyển đổi đối tượng JSON thành JSONObject
            JSONObject jsonObject = (JSONObject) obj;

            // Lấy ra các giá trị từ JSONObject và xuất ra màn hình
            String mssv = (String) jsonObject.get("MSSV");
            String hoTen = (String) jsonObject.get("HOTEN");
            String lop = (String) jsonObject.get("LOP");
            String diaChi = (String) jsonObject.get("DIACHI");
            String email = (String) jsonObject.get("EMAIL");

            System.out.println("MSSV: " + mssv);
            System.out.println("Họ tên: " + hoTen);
            System.out.println("Lớp: " + lop);
            System.out.println("Địa chỉ: " + diaChi);
            System.out.println("Email: " + email);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
