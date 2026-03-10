import java.sql.*;

public class ResultDAO {

    public void addStudent(int id, String name) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement("INSERT INTO students VALUES(?,?)");

            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Student Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addMarks(int id, int s1, int s2, int s3) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement("INSERT INTO marks VALUES(?,?,?,?)");

            ps.setInt(1, id);
            ps.setInt(2, s1);
            ps.setInt(3, s2);
            ps.setInt(4, s3);

            ps.executeUpdate();

            System.out.println("Marks Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void generateResult() {

        try {

            Connection con = DBConnection.getConnection();

            String query =
                    "SELECT students.name, subject1, subject2, subject3 FROM students JOIN marks ON students.id = marks.student_id";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                String name = rs.getString(1);
                int s1 = rs.getInt(2);
                int s2 = rs.getInt(3);
                int s3 = rs.getInt(4);

                int total = s1 + s2 + s3;
                double gpa = total / 3.0;

                System.out.println("Name: " + name);
                System.out.println("Total: " + total);
                System.out.println("GPA: " + gpa);
                System.out.println("--------------------");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}