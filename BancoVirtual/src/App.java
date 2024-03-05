import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha entre as opções: \n 1 - Abrir conta \n 2 - Fechar conta \n 3 - Depósito \n 4 - Saque \n 5 - Tranferência \n 6 - Sair"));

        Cliente cl = new Cliente();

        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, cl);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Teste");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Teste");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Teste");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Teste");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Teste");
                break;
        
            default:
                break;
        }

    }
}
