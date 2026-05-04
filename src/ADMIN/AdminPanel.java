import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JFrame {

    public AdminPanel() {
        setTitle("MiniTec - Admin");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel izquierdo (menú)
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new GridLayout(6, 1));
        sidebar.setPreferredSize(new Dimension(200, 600));

        sidebar.add(new JButton("Dashboard"));
        sidebar.add(new JButton("Products"));
        sidebar.add(new JButton("Orders"));
        sidebar.add(new JButton("Categories"));
        sidebar.add(new JButton("Users"));
        sidebar.add(new JButton("Logout"));

        add(sidebar, BorderLayout.WEST);

        // Panel central
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel title = new JLabel("Category Management");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(title, BorderLayout.NORTH);

        // Tabla
        String[] columnas = {"ID", "Nombre", "Descripción", "Cantidad"};
        String[][] datos = {
                {"C101", "Bebidas", "Jugos y sodas", "50"},
                {"C102", "Snacks", "Papas y galletas", "35"}
        };

        JTable table = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(table);

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

        // Panel derecho (acciones)
        JPanel actions = new JPanel();
        actions.setLayout(new GridLayout(2, 1, 10, 10));
        actions.setPreferredSize(new Dimension(200, 600));

        JButton editBtn = new JButton("Edit Category");
        JButton deleteBtn = new JButton("Delete Category");

        actions.add(editBtn);
        actions.add(deleteBtn);

        add(actions, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new AdminPanel().setVisible(true);
    }
}
