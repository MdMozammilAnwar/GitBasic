public class Date{
	public Date generateTodaysDate(){
	Date d=new Date();
	return d;
	}
	public Time getCurrentTime(){
	return new Date().getTime();
	}
}