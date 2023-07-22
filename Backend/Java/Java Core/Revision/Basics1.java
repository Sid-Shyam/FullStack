package Revision;

public class Basics1 {

	public static void main(String args[]) {
		test obj=new test();//use-a relationship
		obj.setCheck("shyam");
		System.out.println(obj.getCheck());
	}
}
class test{
	private String check;
	protected String ticket;
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check=check;
	}
}
class files{
 test obj;
 public void displayTicketId() {
	 obj.setTicket("152484542");	
	 System.out.println("Test class parameter value:"+obj.getTicket());
 }
}
