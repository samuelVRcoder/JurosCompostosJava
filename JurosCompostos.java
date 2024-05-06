import javax.swing.JOptionPane;

public class JurosCompostos {

	public static void main(String[] args) {
		
		try {
		
			String time = JOptionPane.showInputDialog(null, "Digite o tempo em anos");
		
			String tax = JOptionPane.showInputDialog(null, "Digite a taxa anual");
		
			String money = JOptionPane.showInputDialog(null, "Digite o capital inicial");
		
			String finalMoney = Double.parseDouble(money.replace(',', '.'))*
				(Math.pow(   (   1 + (Double.parseDouble(tax.replace(',', '.'))/100)  ),
				Double.parseDouble(time.replace(',', '.'))))+"";
		
			JOptionPane.showMessageDialog(null, "Seu montante é : "+finalMoney);
		
		}catch(Exception ex) {
			
			JOptionPane.showMessageDialog(null, "Algo deu errado \n\n"+ex);
			
		}

	}

}
