package programas.activi.grupal;

public class ActiviGrupal {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new GitGui().setVisible(true);
        });
    }
}