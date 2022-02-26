public class Date { 
  private int day; 
  public int month; 
  public int year;

  public void setDay(int day){
    if (day>0 && day<32){
      this.day = day;
    }
  }

  public int getDay(){
    return day;
  }
}
