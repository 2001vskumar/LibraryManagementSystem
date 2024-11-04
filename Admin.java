package LibrarySystem;

public class Admin extends User
{
   public Admin(String name)
   {
	   super(name);
   }
   
   public Admin(String name,String email,String phonenumber)
   {
	   super(name,email,phonenumber);
   }
   
   @Override
   public void menu()
   {
	   System.out.println("1. View Books");
	   System.out.println("2. Add Book");
	   System.out.println("3. Delete Book");
	   System.out.println("4. Search");
	   System.out.println("5. Delete all data");
	   System.out.println("6. View Orders");
	   System.out.println("1. Exit");



   }
   
}
