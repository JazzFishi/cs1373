import javax.swing.JOptionPane;
class W13_ass1
{static Book b=new Book();
	public static void main(String[] args)
	{b.setId("1234");
	 b.setTitle("Computer");
	 b.setPrice(500.0);

	 JOptionPane.showMessageDialog(null,"Book ID: "+ b.getId()
									   +"\nBook Title: "+ b.getTitle()
									   +"\nBook Price: "+ b.getPrice());

	}
}