
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class StudentRegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(800, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);

        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);
                         
        //Adds padding/border on the panel
        panel.setBorder(new EmptyBorder(50, 50, 50, 50));

        // Name Fields
        JPanel row1 = new JPanel(new GridLayout(1,3));
        row1.add(new Checkbox("Mr."));
        row1.add(new JLabel("Last:"));
        row1.add(new JLabel("First"));
        row1.add(new JLabel("Middle"));

        JPanel row2 = new JPanel(new GridLayout(1,3));
        row2.add(new Checkbox("Mrs."));
        row2.add(new JTextField());
        row2.add(new JTextField());
        row2.add(new JTextField());

        JPanel row3 = new JPanel(new GridLayout(1,3));
        row3.add(new Checkbox("Ms."));
        row3.add(new JTextField());
        row3.add(new JTextField());
        row3.add(new JTextField());

        panel.add(row1);
        panel.add(row2);
        panel.add(row3);

        // Address Fields
        panel.add(new JLabel("Address"));
        JTextField streetAddress = new JTextField(10);
        JTextField city = new JTextField(20);
        JTextField postal = new JTextField(10);
        JTextField cellPhone = new JTextField(15);
        JTextField poBox = new JTextField(10);
        JTextField county = new JTextField(20);
        JTextField country = new JTextField(20);
        JTextField email = new JTextField(20);
        panel.add(new JLabel("Street Address:"));
        panel.add(streetAddress);
        panel.add(new JLabel("City:"));
        panel.add(city);
        panel.add(new JLabel("Postal Code:"));
        panel.add(postal);
        panel.add(new JLabel("Cell Phone:"));
        panel.add(cellPhone);
        panel.add(new JLabel("PO Box Number:"));
        panel.add(poBox);
        panel.add(new JLabel("County:"));
        panel.add(county);
        panel.add(new JLabel("Country:"));
        panel.add(country);
        panel.add(new JLabel("Email:"));
        panel.add(email);

        // Personal Information Fields
        panel.add(new JLabel("Personal Information"));
        JTextField dob = new JTextField(10);
        JTextField placeOfBirth = new JTextField(20);
        JTextField citizenship = new JTextField(20);
        JTextField passportNumber = new JTextField(10);
        String[] genderOptions = {"Male", "Female"};
        JComboBox<String> gender = new JComboBox<>(genderOptions);
        String[] maritalStatusOptions = {"Single", "Married"};
        JComboBox<String> maritalStatus = new JComboBox<>(maritalStatusOptions);
        panel.add(new JLabel("Date of Birth (MM/DD/YYYY):"));
        panel.add(dob);
        panel.add(new JLabel("Gender:"));
        panel.add(gender);
        panel.add(new JLabel("Place of Birth:"));
        panel.add(placeOfBirth);
        panel.add(new JLabel("Citizenship:"));
        panel.add(citizenship);
        panel.add(new JLabel("Passport Number:"));
        panel.add(passportNumber);
        panel.add(new JLabel("Marital Status:"));
        panel.add(maritalStatus);

        // Next of Kin Fields
        panel.add(new JLabel("Next of Kin"));
        JTextField kinName = new JTextField(20);
        JTextField kinAddress = new JTextField(20);
        JTextField kinTown = new JTextField(20);
        JTextField kinPhone = new JTextField(15);
        JTextField kinEmail = new JTextField(20);
        panel.add(new JLabel("Name:"));
        panel.add(kinName);
        panel.add(new JLabel("Address:"));
        panel.add(kinAddress);
        panel.add(new JLabel("Town:"));
        panel.add(kinTown);
        panel.add(new JLabel("Telephone:"));
        panel.add(kinPhone);
        panel.add(new JLabel("Email:"));
        panel.add(kinEmail);

        // Enrollment Information Fields
        panel.add(new JLabel("Enrollment Information"));
        String[] semesters = {"Fall", "Spring", "Summer"};
        JComboBox<String> semester = new JComboBox<>(semesters);
        JTextField enrollmentYear = new JTextField(4);
        panel.add(new JLabel("Semester:"));
        panel.add(semester);
        panel.add(new JLabel("Year:"));
        panel.add(enrollmentYear);

        // Degree Information
        panel.add(new JLabel("Degree Information"));
        String[] degrees = {"Bachelor's", "Master's", "Doctoral", "Non-degree seeking"};
        JComboBox<String> degree = new JComboBox<>(degrees);
        panel.add(degree);

        // Sponsor Information
        panel.add(new JLabel("Sponsor Information"));
        JTextField sponsorName = new JTextField(20);
        JTextField sponsorAddress = new JTextField(20);
        JTextField sponsorPhone = new JTextField(15);
        JTextField sponsorEmail = new JTextField(20);
        panel.add(new JLabel("Full Name:"));
        panel.add(sponsorName);
        panel.add(new JLabel("Address:"));
        panel.add(sponsorAddress);
        panel.add(new JLabel("Telephone:"));
        panel.add(sponsorPhone);
        panel.add(new JLabel("Email:"));
        panel.add(sponsorEmail);

        // Disability Information
        panel.add(new JLabel("Disabilities"));
        String[] disabilities = {"None", "Hearing", "Mobility", "Sight", "Learning Disability"};
        JComboBox<String> disability = new JComboBox<>(disabilities);
        panel.add(disability);

        // Referral Information
        panel.add(new JLabel("How did you learn about the institution?"));
        String[] referrals = {"Newspaper", "TV", "Radio", "College Fair", "Exhibition", "Social Media"};
        JComboBox<String> referral = new JComboBox<>(referrals);
        panel.add(referral);

        // Attestation
        panel.add(new JLabel("Attestation"));
        JTextField signature = new JTextField(20);
        JTextField date = new JTextField(10);
        panel.add(new JLabel("Signature:"));
        panel.add(signature);
        panel.add(new JLabel("Date:"));
        panel.add(date);

        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Successfully Registered"));

        panel.add(registerButton);

        frame.setVisible(true);
    }
}
