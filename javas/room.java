public class room
{
private int roomno;
private string roomtype;
private double roomarea;
private boolean ACmachine;

public void setdata(int roomno,string roomtype,double roomarea,boolean acmachine){
this.roomno=roomno;
this.roomtype=roomtype=roomtype;
this.roomarea=roomarea;
this.ACmachine=ACmachine;
}
public void displaydata (){
system.out println("roomnumber:"+roomno);
system.out println("roomtype:"+roomtype);
system.out println("roomarea:"+roomarea);
system.out println("ACmachine:"+(ACmachine?"yes":"no"));
}
publicstatic void main(string[]args){
room myroom=new room();
room my room setdata(101,standard,250.0,true);
my room.displaydata();
}




























