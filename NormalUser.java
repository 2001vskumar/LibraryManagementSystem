package LibrarySystem;

public class NormalUser extends User
{
	 public NormalUser(String name)
	   {
		   super(name);
	   }
	   
	   public NormalUser(String name,String email,String phonenumber)
	   {
		   super(name,email,phonenumber);
	   }
	   
	   @Override
	   public void menu()
	   {
		   System.out.println("1. View Books");
		   System.out.println("2. Search");
		   System.out.println("3. Place Order");
		   System.out.println("4. Borrow book");
		   System.out.println("5. Calculate fine");
		   System.out.println("6. Return book");
		   System.out.println("7. Exit");
	   }
}
