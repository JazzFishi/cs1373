import javax.swing.JOptionPane;
class W13_ass2
{static Book b=new Book();
	public static void main(String[] args)
	{b.setId(JOptionPane.showInputDialog("Enter Book ID: "));
	 b.setTitle(JOptionPane.showInputDialog("Enter Book Title: "));
	 b.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter Book Price: ")));

	 JOptionPane.showMessageDialog(null,"Book ID: "+ b.getId()
									   +"\nBook Title: "+ b.getTitle()
									   +"\nBook Price: "+ b.getPrice());

	}
}